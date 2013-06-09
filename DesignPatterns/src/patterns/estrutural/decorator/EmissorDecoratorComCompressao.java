package patterns.estrutural.decorator;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;

public class EmissorDecoratorComCompressao extends EmissorDecorator {

	public EmissorDecoratorComCompressao(IEmissor emissor) {
		super(emissor);
	}

	@Override
	public void enviar(String mensagem) {
		System.out.println("Enviando mensagem comprimida: ");
		String mensagemComprimida;
		try {
			mensagemComprimida = comprimir(mensagem);
		} catch (IOException e) {
			mensagemComprimida = mensagem;
		}
		this.getEmissor().enviar(mensagemComprimida);
	}
	
	private String comprimir(String mensagem) throws IOException {
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		DeflaterOutputStream dout = new DeflaterOutputStream(out, new Deflater());
		dout.write(mensagem.getBytes());
		dout.close();
		return new String(out.toByteArray());
	}
}
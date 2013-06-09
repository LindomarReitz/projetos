package teste.services;

import java.util.List;

import org.springframework.flex.remoting.RemotingDestination;
import org.springframework.flex.remoting.RemotingInclude;
import org.springframework.stereotype.Service;

import valueObjects.UsuarioVO;

@Service("UsuarioService")
@RemotingDestination(channels={"my-amf"})
public class UsuarioService extends AbstractService<UsuarioVO> {

	@RemotingInclude
	public UsuarioVO login(UsuarioVO t) {
		List<UsuarioVO> usuarios = this.findByExample(t);
		if (usuarios.size() == 1)
			return usuarios.get(0);
		
		return null;
	}
}
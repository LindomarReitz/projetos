package teste.services;

import org.springframework.flex.remoting.RemotingDestination;
import org.springframework.stereotype.Service;

import valueObjects.ProjetoVO;

@Service("ProjetoService")
@RemotingDestination(channels={"my-amf"})
public class ProjetoService extends AbstractService<ProjetoVO> {
	
}
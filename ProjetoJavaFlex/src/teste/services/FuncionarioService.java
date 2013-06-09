package teste.services;

import org.springframework.flex.remoting.RemotingDestination;
import org.springframework.stereotype.Service;

import valueObjects.FuncionarioVO;

@Service("FuncionarioService")
@RemotingDestination(channels={"my-amf"})
public class FuncionarioService extends AbstractService<FuncionarioVO> {
	
}

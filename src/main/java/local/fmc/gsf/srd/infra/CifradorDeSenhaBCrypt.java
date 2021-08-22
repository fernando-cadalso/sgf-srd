package local.fmc.gsf.srd.infra;

import local.fmc.gsf.srd.dominio.CifradorDeSenha;

public class CifradorDeSenhaBCrypt implements CifradorDeSenha {

	@Override
	public String cifrarSenha(String senha) {

//		return BCrypt.hashpw(senha, BCrypt.gensalt());
		return "Senha cifrada. Atualizar método.";

	}

	@Override
	public boolean validarSenha(String senhaCifrada, String senhaAberta) {
//		return BCrypt.checkpw(senhaAberta, senhaCifrada);
		return true;
	}

}

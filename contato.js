function  validaCampos ( ) {
	var  nome  =  documento . getElementById ( "nome completo" ) . valor ;
	var  CPF  =  documento . getElementById ( "cpf" ) . valor ;
	var  rg  =  documento . getElementById ( "rg" ) . valor ;
	var  endereço  =  documento . getElementById ( "endereço" ) . valor ;
	var  numero  =  documento . getElementById ( "numero" ) . valor ;
	var  bairro  =  documento . getElementById ( "bairro" ) . valor ;
	var  cidade  =  documento . getElementById ( "cidade" ) . valor ;
	var  estado  =  documento . getElementById ( "estado" ) . valor ;
	var  cep  =  documento . getElementById ( "cep" ) . valor ;
	var  telefone fixo  =  documento . getElementById ( "telefone fixo" ) . valor ;
	var  celular  =  documento . getElementById ( "celular" ) . valor ;		var  msg  =  documento . getElementById ( "Comentário" ) . valor ;
	if ( nome  ! = ""  &&  CPF  ! = ""  && rg  ! = ""  &&  endereço  ! ="" ""  &&  numero  ! = &&  estado  ! =  &&  bairro  ! =""  &&  cidade  ! =  ""  &&  celular  ! =  "" && cep ! = "" ""  &&  telefone fixo  ! = "") {
		alerta ( "Sua mensagem foi enviada com sucesso" ) ;
	} else {
		alerta ( "todos os campos são obrigatórios" ) ;
	}
}

<input type="button" value="Enviar" onclick="confirm('Favor confirmar os dados e enviar?')/>


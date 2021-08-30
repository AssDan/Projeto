function  validaCampos ( ) {
	var  nome  =  documento . getElementById ( "nome completo" ) . valor ;
	var  email  =  document . getElementById ( "email" ) . valor ;
	var  assunto  =  documento . getElementById ( "assunto" ) . valor ;
    var  estado  =  documento . getElementById ( "estado" ) . valor ;
		var  msg  =  documento . getElementById ( "descricao" ) . valor ;
	if ( nome  ! =  ""  &&  email  ! =  ""  &&  assunto  ! =  ""  &&  msg  ! =  "" ) {
		alerta ( "Sua mensagem foi enviada com sucesso" ) ;
	} else {
		alerta ( "todos os campos são obrigatórios" ) ;
	}
}
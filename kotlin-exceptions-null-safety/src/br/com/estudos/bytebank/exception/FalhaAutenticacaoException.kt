package br.com.estudos.bytebank.exception

class FalhaAutenticacaoException(
    mensagem: String = "Falha na autenticação"
) : Exception(mensagem)
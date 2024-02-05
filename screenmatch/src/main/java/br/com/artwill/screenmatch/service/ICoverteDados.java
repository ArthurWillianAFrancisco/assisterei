package br.com.artwill.screenmatch.service;

public interface ICoverteDados {
    <T> T obterDados(String json, Class<T> classe);
}

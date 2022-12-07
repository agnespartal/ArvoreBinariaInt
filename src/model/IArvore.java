package model;

public interface IArvore {
	
	public void insertLeaf(int valor);
	public void search (int valor) throws Exception;
	public void removeChild (int valor)throws Exception;
	public void prefixSearch()throws Exception;
	public void infixSearch()throws Exception;
	public void postfixSearch()throws Exception;
	
}

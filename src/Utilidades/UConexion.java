package Utilidades;

public class UConexion
{
	
	private UConexion instancia;
	
	private UConexion()
	{
		
	}
	
	private UConexion getUConexion()
	{
		if(instancia==null)
		{
			instancia = new UConexion();
		}
		
		return instancia;
	}
	

}

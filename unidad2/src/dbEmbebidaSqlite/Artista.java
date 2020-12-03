package dbEmbebidaSqlite;

public class Artista {
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	public void guardar() {
		OperacionesDb op = new OperacionesDb();
		op.insertaArtist(this);
	}
	
	public void verTodosArtistas() {
		OperacionesDb op = new OperacionesDb();
		op.listaArtistas();
	}
	
	public void verCancionesArtista(String titulo) {
		OperacionesDb op = new OperacionesDb();
		op.cancionArtista(this, titulo);
	}
	
	public void verCancionesAlbum(String titulo) {
		OperacionesDb op = new OperacionesDb();
		op.cancionAlbum(this, titulo);
	}
	
	public void verPrimeraCancioneAlbum(String titulo) {
		OperacionesDb op = new OperacionesDb();
		op.primeraCancionAlbum(this, titulo);
	}
	
}

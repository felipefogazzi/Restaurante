package Model;

public class ItemPedido {
	
	private Item item;
	private Estado estado;

	public ItemPedido(Item item) {
		this.item = item;
		this.estado = Estado.PENDENTE;
	}
	
	public Estado getEstado() {
		return estado;
	}
	
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
	public Item getItem() {
		return item;
	}
}

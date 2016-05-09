package Model;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
	
	private Mesa mesa;
	private List<ItemPedido> itens;
	private Estado estado;
	private Garcom garcom;
	
	public Pedido(Garcom garcom, Mesa mesa) {
		this.garcom = garcom;
		this.mesa = mesa;
		this.itens = new ArrayList<ItemPedido>();
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public Mesa getMesa() {
		return mesa;
	}

	public List<ItemPedido> getItens() {
		return itens;
	}

	public Garcom getGarcom() {
		return garcom;
	}
	
	public void addItems(Pedido pedido) {
		itens.addAll(pedido.getItens());
	}
	
	public void addItem(Item item) {
		itens.add(new ItemPedido(item));
	}
}

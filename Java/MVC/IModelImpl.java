package model;

public class IModelImpl extends IModel{

	@Override
	public int decrementar() {
		return --contador;
	}

	@Override
	public int incrementar() {
		return ++contador;
	}

	
	
}

package resources;

public enum APIresources {
	
	LoginAPI("/api/ecom/auth/login"),
	AddProductAPI("/api/ecom/product/add-product"),
	PlaceorderAPI("/api/ecom/order/create-order");
	private String resource;
	
	APIresources(String resource)
	{
		this.resource=resource;
	}

	public String getResource()
	{
		return resource;
	}
}

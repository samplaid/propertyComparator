/*
 * Generic response to return in JSON 
 */

package lu.wealins.lissia_services.web.model;

public class GenericResponse<T> extends RestResponse {
	
	private T data;

	public GenericResponse(){
		this.data = null;
	}
	
	public GenericResponse(T data){
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
	
}

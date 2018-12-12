package money;

public class BankDTO {
	private String id;   //고객 아이디
	private String name; //고객 이름
	private int age;	//고객 나이
	private String tel;		//고객 전화번호
	
	public BankDTO(String id, String name, int age, String tel) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.tel = tel;
	}

	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	@Override
	public String toString() {
		return "BankDTO [id=" + id + ", name=" + name + ", age=" + age + ", tel=" + tel + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
}

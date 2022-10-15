package dependencyinjection;

public class AB {

	A aobj = null;
	B bobj = null;

	public void setAobj(A refobj) {
		aobj = refobj;
	}

	AB(B refobj) {
		System.out.println("AB constructor");
		this.bobj = refobj;
	}

	public void show() {
		aobj.m1();
		bobj.m2();

	}

}

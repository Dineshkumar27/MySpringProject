package dependencyinjection;

public class AB {

	A aobj = null;
	B bobj = null;

	public void setAobj(A refobj) {
		aobj = refobj;
	}

	AB(A aobj, B refobj) {
		bobj = refobj;
		aobj = aobj;
	}

	public void show() {
		aobj.m1();
		bobj.m2();

	}

}

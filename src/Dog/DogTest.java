package Dog;

public class DogTest {
public static void main(String[] args) {
	Dog[] arr=new Dog[4];
	Dog s1=new Dog("С��","Ů" ,1);
	Dog s2=new Dog("С��","��" ,2);
	Dog s3=new Dog("С��","��" ,1);
	Dog s4=new Dog("С��","Ů" ,2);
	arr[0]=s1;
	arr[1]=s2;
	arr[2]=s3;
	arr[3]=s4;
	for(Dog ss:arr){
		System.out.println(ss.show());
	}
}
}

package Dog;

public class DogTest {
public static void main(String[] args) {
	Dog[] arr=new Dog[4];
	Dog s1=new Dog("小芳","女" ,1);
	Dog s2=new Dog("小铭","男" ,2);
	Dog s3=new Dog("小夫","男" ,1);
	Dog s4=new Dog("小莉","女" ,2);
	arr[0]=s1;
	arr[1]=s2;
	arr[2]=s3;
	arr[3]=s4;
	for(Dog ss:arr){
		System.out.println(ss.show());
	}
}
}

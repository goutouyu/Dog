package Dog;

public class DogTest {
public static void main(String[] args) {
	Dog[] arr=new Dog[4];
	Dog s1=new Dog("小花","女" ,1);
	Dog s2=new Dog("小明","男" ,2);
	Dog s3=new Dog("小丽","女" ,1);
	Dog s4=new Dog("小华","男" ,2);
	arr[0]=s1;
	arr[1]=s2;
	arr[2]=s3;
	arr[3]=s4;
	for(Dog ss:arr){
		System.out.println(ss.show());
	}
}
}

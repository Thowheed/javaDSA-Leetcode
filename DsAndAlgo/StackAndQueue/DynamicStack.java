package StackAndQueue;

public class DynamicStack extends CustomStackImpl {
    public DynamicStack() {
        super();

        //even if we don't call super it will call the immediate parent class super
    }

    public DynamicStack(int size) {
        super(size);

        //even if we don't call super it will call the immediate parent class super
    }

    //this will never be full

    //only issue is we want dynamicallygrowing array

    @Override
    public boolean push(int item){
        if(this.isFull()){
            //double the array size

            int[] temp = new int[data.length*2];

//            for (int i =0;i<data.length-1;i++){
//                temp[i] = data[i];
//            }

            //enhanced method
            if (data.length - 1 >= 0) System.arraycopy(data, 0, temp, 0, data.length - 1);

            data = temp;
        }

        //insert item normally since array is not full

        super.push(item);
        return true;
    }
}

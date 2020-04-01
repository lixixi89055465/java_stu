package com.atguigu.principle.inversion.improve;

/**
 * @author lixiang
 * @date 2020-04-01-13:24
 */
public class DependencyPass {
    public static void main(String[] args) {
        ChangHong changHong = new ChangHong();
//        OpenAndClose openAndClose = new OpenAndClose();
//        openAndClose.open(changHong);
        //通过构造器进行依赖传递
//        OpenAndClose openAndClose = new OpenAndClose(changHong);
//        openAndClose.open();
        //通过setter 方法进行依赖传递
        OpenAndClose openAndClose = new OpenAndClose();
        openAndClose.setTv(new ChangHong());
        openAndClose.open();


    }
}


////方式一：通过接口传递实现依赖
////开关的接口
//interface IOpenAndClose {
//    public void open(ITV tv);//抽象方法，接收接口
//}
//
//interface ITV {//ITV 接口
//
//    public void play();
//}
//
////实现接口
//class OpenAndClose implements IOpenAndClose {
//
//    @Override
//    public void open(ITV tv) {
//        tv.play();
//    }
//}

//
////方式2：通过构造方法依赖传递
//interface IOpenAndClose {
//    public void open(); //抽象方法
//}
//
//interface ITV {//ITV 接口
//
//    public void play();
//}
//
//class ChangHong implements ITV {
//
//    @Override
//    public void play() {
//        System.out.println("长虹电视机，打开 ");
//    }
//}
//
//class OpenAndClose implements IOpenAndClose {
//    public ITV tv;
//
//    public OpenAndClose(ITV tv) {
//        this.tv = tv;
//    }
//
//    @Override
//    public void open() {
//        this.tv.play();
//    }
//}

interface IOpenAndClose {
    public void open(); //抽象方法

    public void setTv(ITV tv);
}

interface ITV { //ITV 接口
    public void play();
}

class OpenAndClose implements IOpenAndClose {
    private ITV tv;

    @Override
    public void open() {
        this.tv.play();
    }

    @Override
    public void setTv(ITV tv) {
        this.tv = tv;
    }
}

class ChangHong implements ITV {

    @Override
    public void play() {
        System.out.println("长虹电视开了 ");
    }
}
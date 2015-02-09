package com.howbuy.costestimate.classloader;

import java.io.File;
import java.net.URL;
import java.net.URLClassLoader;

/**
 * 测试一个jar包中的class被加载到内存时，这个jar文件能否删除。如果不能删除
 * 
 * 找出解决方法. 这就是这个例子的初衷.
 * @author li.zhang
 * 2014-9-11
 *
 */
public class Demo03
{
    /**
     * @param args
     * @throws Exception 
     */
    @SuppressWarnings("unused")
    public static void main(String[] args) throws Exception
    {
        URL[] urls = new URL[1];
        urls[0] = new File("jars/widgets.jar").toURI().toURL();
        URLClassLoader loader = new URLClassLoader(urls);
        
        loader.loadClass("com.howbuy.widgets.SpeakerV2");
        
        /**
         * 从这里我们可以看到,当没有创建User的实例对象的时候，我们在后面直接设置类加载器为null,然后gc垃圾回收，
         * 加载的类都会被卸载，从而widgets.jar文件可以被删除。而当我们clzz.newInstance()创建了一个User实例的时候再
         * 删除widgets.jar就会删除失败.
         */
        Class<?> clzz = loader.loadClass("com.howbuy.widgets.User");
        Object user = clzz.newInstance();
        
        /**
         * 在什么时候一个java class/interface会被卸载呢？Sun公司的原话是这么说的：
         * "
         *   class or interface may be unloaded if and only if its class loader is unreachable. 
         *   Classes loaded by the bootstrap loader may not be unloaded.
         *   
         *   这句英文翻译过来的意思是: 类或者接口可能会被卸载当且仅当加载它的类加载器是不可达的.
         *   被bootstrap类加载器加载的类是不能被卸载的.
         *  " 
         *  
         *  下面两句是关键，有了下面两句widgets.jar文件才能被删除成功(这点已经测试过).
         *  
         *  否则，是不能成功删除widgets.jar文件的.
         */
        user = null;
        loader = null;
        Runtime.getRuntime().gc();
        
        
        while(true);
    }

}

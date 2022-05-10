package com.afs.processor;

import com.afs.butterknife.annotation.BindView;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.Filer;
import javax.annotation.processing.ProcessingEnvironment;
import javax.annotation.processing.RoundEnvironment;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;
import javax.tools.Diagnostic;

/**
 * 注解处理器，用来生成代码的
 * 使用前需要注册
 */
//@AutoService(Processor.class)
public class BindViewProcessor extends AbstractProcessor {

    Filer mFiler;
//    private Map<String, ClassCreatorProxy> mProxyMap = new HashMap<>();

    //支持的版本
    @Override
    public SourceVersion getSupportedSourceVersion() {
        return SourceVersion.latestSupported();
    }

    //2.能用来处理那些注解
    @Override
    public Set<String> getSupportedAnnotationTypes() {
        HashSet<String> supportTypes = new LinkedHashSet<>();
        supportTypes.add(BindView.class.getCanonicalName());
        return supportTypes;
    }

    //3.定义一个用来生成APT目录下文件的对象
    @Override
    public synchronized void init(ProcessingEnvironment processingEnv) {
        super.init(processingEnv);
        mFiler = processingEnv.getFiler();
    }

    /**
     * 核心逻辑在这里
     * 1、Process方法是怎么被回调的？
     * 2、调用多少次是怎么确定的？
     * 3、返回值有什么用？
     * 4、自定义的APT如果有多个，如何控制他们的执行顺序？
     *
     * @param set
     * @param roundEnv
     * @return
     */
    @Override
    public boolean process(Set<? extends TypeElement> set, RoundEnvironment roundEnv) {
        if (set.isEmpty()) {
            return false;
        }
        processingEnv.getMessager().printMessage(Diagnostic.Kind.NOTE, "jett----------------------------" + set);
        //任务开始
        Set<? extends Element> elementsAnnotatedWith = roundEnv.getElementsAnnotatedWith(BindView.class);
        return false;
    }
}
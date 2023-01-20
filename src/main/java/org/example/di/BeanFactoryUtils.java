package org.example.di;

import org.example.annotation.Inject;
import org.reflections.ReflectionUtils;

import java.lang.reflect.Constructor;
import java.util.Set;

public class BeanFactoryUtils {

    /**
     * 해당 class의 생성자중 @Inject 가 붙은 것만 반환하는 메서드.
     * 예제 구현의 편의를 위해 @Inject 가 붙은 메서드들 중에 첫번째 것 하나만 반환한다.
     * @param clazz
     * @return @Inject가 붙은 첫번째 생성자.
     */
    public static Constructor<?> getInjectedConstructor(Class<?> clazz) {
        Set<Constructor> injectedConstructors = ReflectionUtils.getAllConstructors(clazz, ReflectionUtils.withAnnotation(Inject.class));

        if (injectedConstructors.isEmpty()) {
            return null;
        }

        return injectedConstructors.iterator().next();
    }
}
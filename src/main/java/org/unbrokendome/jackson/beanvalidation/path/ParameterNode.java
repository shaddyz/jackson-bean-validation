package org.unbrokendome.jackson.beanvalidation.path;

import jakarta.validation.ElementKind;
import jakarta.validation.Path;

import javax.annotation.Nonnull;


final class ParameterNode extends AbstractNode implements Path.ParameterNode {

    private final int parameterIndex;


    ParameterNode(String name, int parameterIndex) {
        super(name);
        this.parameterIndex = parameterIndex;
    }


    @Override
    @Nonnull
    public ElementKind getKind() {
        return ElementKind.PARAMETER;
    }


    @Override
    public int getParameterIndex() {
        return parameterIndex;
    }
}

package org.unbrokendome.jackson.beanvalidation;

import javax.validation.Payload;
import javax.validation.constraints.NotNull;


class NotNullConstraintDescriptor extends AbstractConstraintDescriptor<NotNull> {

    public NotNullConstraintDescriptor(NotNull annotation) {
        super(annotation);
    }

    @Override
    protected String getMessageFromAnnotation(NotNull annotation) {
        return annotation.message();
    }

    @Override
    protected Class<?>[] getGroupsFromAnnotation(NotNull annotation) {
        return annotation.groups();
    }

    @Override
    protected Class<? extends Payload>[] getPayloadFromAnnotation(NotNull annotation) {
        return annotation.payload();
    }
}

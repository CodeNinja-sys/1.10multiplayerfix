/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.i;

import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import java.io.OutputStream;

class f
extends ObjectOutputStream {
    static final int a = 0;
    static final int b = 1;

    f(OutputStream outputStream) {
        super(outputStream);
    }

    @Override
    protected void writeStreamHeader() {
        this.writeByte(5);
    }

    @Override
    protected void writeClassDescriptor(ObjectStreamClass objectStreamClass) {
        Class<?> class_ = objectStreamClass.forClass();
        if (class_.isPrimitive() || class_.isArray() || class_.isInterface() || objectStreamClass.getSerialVersionUID() == 0L) {
            this.write(0);
            super.writeClassDescriptor(objectStreamClass);
        } else {
            this.write(1);
            this.writeUTF(objectStreamClass.getName());
        }
    }
}


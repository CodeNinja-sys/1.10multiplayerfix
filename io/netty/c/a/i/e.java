/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.i;

import io.netty.c.a.i.c;
import java.io.EOFException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.io.StreamCorruptedException;

class e
extends ObjectInputStream {
    private final c a;

    e(InputStream inputStream, c c2) {
        super(inputStream);
        this.a = c2;
    }

    @Override
    protected void readStreamHeader() {
        int n2 = this.readByte() & 0xFF;
        if (n2 != 5) {
            throw new StreamCorruptedException("Unsupported version: " + n2);
        }
    }

    @Override
    protected ObjectStreamClass readClassDescriptor() {
        int n2 = this.read();
        if (n2 < 0) {
            throw new EOFException();
        }
        switch (n2) {
            case 0: {
                return super.readClassDescriptor();
            }
            case 1: {
                String string = this.readUTF();
                Class class_ = this.a.a(string);
                return ObjectStreamClass.lookupAny(class_);
            }
        }
        throw new StreamCorruptedException("Unexpected class descriptor type: " + n2);
    }

    protected Class resolveClass(ObjectStreamClass objectStreamClass) {
        Class<?> class_;
        try {
            class_ = this.a.a(objectStreamClass.getName());
        }
        catch (ClassNotFoundException classNotFoundException) {
            class_ = super.resolveClass(objectStreamClass);
        }
        return class_;
    }
}


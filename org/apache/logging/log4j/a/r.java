/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.a;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import org.apache.logging.log4j.a.m;

public class r
implements m {
    private static final long a = -5903272448334166185L;
    private transient Object b;

    public r(Object object) {
        if (object == null) {
            object = "null";
        }
        this.b = object;
    }

    @Override
    public String a() {
        return this.b.toString();
    }

    @Override
    public String b() {
        return this.b.toString();
    }

    @Override
    public Object[] c() {
        return new Object[]{this.b};
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        r r2 = (r)object;
        return !(this.b == null ? r2.b != null : !this.b.equals(r2.b));
    }

    public int hashCode() {
        return this.b != null ? this.b.hashCode() : 0;
    }

    public String toString() {
        return "ObjectMessage[obj=" + this.b.toString() + "]";
    }

    private void a(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        if (this.b instanceof Serializable) {
            objectOutputStream.writeObject(this.b);
        } else {
            objectOutputStream.writeObject(this.b.toString());
        }
    }

    private void a(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.b = objectInputStream.readObject();
    }

    @Override
    public Throwable d() {
        return this.b instanceof Throwable ? (Throwable)this.b : null;
    }
}


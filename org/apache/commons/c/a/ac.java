/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c.a;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import org.apache.commons.c.a.ae;
import org.apache.commons.c.a.af;
import org.apache.commons.c.c;

public class ac
extends ae {
    private boolean b = false;
    private boolean c = false;
    protected String[] a;
    private Class d = null;

    public static String a(Object object) {
        return ac.a(object, null, false, false, null);
    }

    public static String a(Object object, af af2) {
        return ac.a(object, af2, false, false, null);
    }

    public static String a(Object object, af af2, boolean bl2) {
        return ac.a(object, af2, bl2, false, null);
    }

    public static String a(Object object, af af2, boolean bl2, boolean bl3) {
        return ac.a(object, af2, bl2, bl3, null);
    }

    public static String a(Object object, af af2, boolean bl2, boolean bl3, Class class_) {
        return new ac(object, af2, null, class_, bl2, bl3).toString();
    }

    public static String a(Object object, Collection collection) {
        return ac.a(object, ac.a(collection));
    }

    static String[] a(Collection collection) {
        if (collection == null) {
            return org.apache.commons.c.c.c;
        }
        return ac.a(collection.toArray());
    }

    static String[] a(Object[] arrobject) {
        ArrayList<String> arrayList = new ArrayList<String>(arrobject.length);
        for (Object object : arrobject) {
            if (object == null) continue;
            arrayList.add(object.toString());
        }
        return arrayList.toArray(org.apache.commons.c.c.c);
    }

    public static String a(Object object, String ... arrstring) {
        return new ac(object).a(arrstring).toString();
    }

    public ac(Object object) {
        super(object);
    }

    public ac(Object object, af af2) {
        super(object, af2);
    }

    public ac(Object object, af af2, StringBuffer stringBuffer) {
        super(object, af2, stringBuffer);
    }

    public ac(Object object, af af2, StringBuffer stringBuffer, Class class_, boolean bl2, boolean bl3) {
        super(object, af2, stringBuffer);
        this.b(class_);
        this.b(bl2);
        this.a(bl3);
    }

    protected boolean a(Field field) {
        if (field.getName().indexOf(36) != -1) {
            return false;
        }
        if (Modifier.isTransient(field.getModifiers()) && !this.e()) {
            return false;
        }
        if (Modifier.isStatic(field.getModifiers()) && !this.d()) {
            return false;
        }
        return this.a == null || Arrays.binarySearch(this.a, field.getName()) < 0;
    }

    protected void a(Class class_) {
        if (class_.isArray()) {
            this.b(this.g());
            return;
        }
        AccessibleObject[] arraccessibleObject = class_.getDeclaredFields();
        AccessibleObject.setAccessible(arraccessibleObject, true);
        for (AccessibleObject accessibleObject : arraccessibleObject) {
            String string = ((Field)accessibleObject).getName();
            if (!this.a((Field)accessibleObject)) continue;
            try {
                Object object = this.b((Field)accessibleObject);
                this.a(string, object);
            }
            catch (IllegalAccessException illegalAccessException) {
                throw new InternalError("Unexpected IllegalAccessException: " + illegalAccessException.getMessage());
            }
        }
    }

    public String[] b() {
        return (String[])this.a.clone();
    }

    public Class c() {
        return this.d;
    }

    protected Object b(Field field) {
        return field.get(this.g());
    }

    public boolean d() {
        return this.b;
    }

    public boolean e() {
        return this.c;
    }

    public ac b(Object object) {
        this.i().d(this.h(), null, object);
        return this;
    }

    public void a(boolean bl2) {
        this.b = bl2;
    }

    public void b(boolean bl2) {
        this.c = bl2;
    }

    public ac a(String ... arrstring) {
        if (arrstring == null) {
            this.a = null;
        } else {
            this.a = ac.a(arrstring);
            Arrays.sort(this.a);
        }
        return this;
    }

    public void b(Class class_) {
        Object object;
        if (class_ != null && (object = this.g()) != null && !class_.isInstance(object)) {
            throw new IllegalArgumentException("Specified class is not a superclass of the object");
        }
        this.d = class_;
    }

    @Override
    public String toString() {
        Class<?> class_;
        if (this.g() == null) {
            return this.i().p();
        }
        this.a(class_);
        for (class_ = this.g().getClass(); class_.getSuperclass() != null && class_ != this.c(); class_ = class_.getSuperclass()) {
            this.a(class_);
        }
        return super.toString();
    }
}


/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.persistence.AttributeConverter
 */
package org.apache.logging.log4j.core.a.a.b.a;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import javax.persistence.AttributeConverter;
import org.apache.logging.log4j.core.a.a.b.a.i;
import org.apache.logging.log4j.core.d.v;

public class j
implements AttributeConverter {
    private static final int a = 10;
    private static final Field b;
    private static final Field c;

    public String a(Throwable throwable) {
        if (throwable == null) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        this.a(stringBuilder, throwable);
        return stringBuilder.toString();
    }

    private void a(StringBuilder stringBuilder, Throwable throwable) {
        stringBuilder.append(throwable.toString()).append('\n');
        for (StackTraceElement stackTraceElement : throwable.getStackTrace()) {
            stringBuilder.append("\tat ").append(stackTraceElement).append('\n');
        }
        if (throwable.getCause() != null) {
            stringBuilder.append("Caused by ");
            this.a(stringBuilder, throwable.getCause());
        }
    }

    public Throwable a(String string) {
        if (v.a(string)) {
            return null;
        }
        List<String> list = Arrays.asList(string.split("(\n|\r\n)"));
        return this.a(list.listIterator(), false);
    }

    private Throwable a(ListIterator listIterator, boolean bl2) {
        String string;
        String string2 = (String)listIterator.next();
        if (bl2) {
            string2 = string2.substring(10);
        }
        int n2 = string2.indexOf(":");
        String string3 = null;
        if (n2 > 1) {
            string = string2.substring(0, n2);
            if (string2.length() > n2 + 1) {
                string3 = string2.substring(n2 + 1).trim();
            }
        } else {
            string = string2;
        }
        ArrayList<StackTraceElement> arrayList = new ArrayList<StackTraceElement>();
        Throwable throwable = null;
        while (listIterator.hasNext()) {
            String string4 = (String)listIterator.next();
            if (string4.startsWith("Caused by ")) {
                listIterator.previous();
                throwable = this.a(listIterator, true);
                break;
            }
            arrayList.add(i.b(string4.trim().substring(3).trim()));
        }
        return this.a(string, string3, throwable, arrayList.toArray(new StackTraceElement[arrayList.size()]));
    }

    private Throwable a(String string, String string2, Throwable throwable, StackTraceElement[] arrstackTraceElement) {
        try {
            Throwable throwable2;
            Class<?> class_ = Class.forName(string);
            if (!Throwable.class.isAssignableFrom(class_)) {
                return null;
            }
            if (string2 != null && throwable != null) {
                throwable2 = this.a(class_, string2, throwable);
                if (throwable2 == null) {
                    throwable2 = this.a(class_, throwable);
                    if (throwable2 == null) {
                        throwable2 = this.a(class_, string2);
                        if (throwable2 == null) {
                            throwable2 = this.a(class_);
                            if (throwable2 != null) {
                                c.set(throwable2, string2);
                                b.set(throwable2, throwable);
                            }
                        } else {
                            b.set(throwable2, throwable);
                        }
                    } else {
                        c.set(throwable2, string2);
                    }
                }
            } else if (throwable != null) {
                throwable2 = this.a(class_, throwable);
                if (throwable2 == null && (throwable2 = this.a(class_)) != null) {
                    b.set(throwable2, throwable);
                }
            } else if (string2 != null) {
                throwable2 = this.a(class_, string2);
                if (throwable2 == null && (throwable2 = this.a(class_)) != null) {
                    c.set(throwable2, throwable);
                }
            } else {
                throwable2 = this.a(class_);
            }
            if (throwable2 == null) {
                return null;
            }
            throwable2.setStackTrace(arrstackTraceElement);
            return throwable2;
        }
        catch (Exception exception) {
            return null;
        }
    }

    private Throwable a(Class class_, String string, Throwable throwable) {
        try {
            Constructor<?>[] arrconstructor;
            for (Constructor<?> constructor : arrconstructor = class_.getConstructors()) {
                Class<?>[] arrclass = constructor.getParameterTypes();
                if (arrclass.length != 2) continue;
                if (String.class == arrclass[0] && Throwable.class.isAssignableFrom(arrclass[1])) {
                    return (Throwable)constructor.newInstance(string, throwable);
                }
                if (String.class != arrclass[1] || !Throwable.class.isAssignableFrom(arrclass[0])) continue;
                return (Throwable)constructor.newInstance(throwable, string);
            }
            return null;
        }
        catch (Exception exception) {
            return null;
        }
    }

    private Throwable a(Class class_, Throwable throwable) {
        try {
            Constructor<?>[] arrconstructor;
            for (Constructor<?> constructor : arrconstructor = class_.getConstructors()) {
                Class<?>[] arrclass = constructor.getParameterTypes();
                if (arrclass.length != 1 || !Throwable.class.isAssignableFrom(arrclass[0])) continue;
                return (Throwable)constructor.newInstance(throwable);
            }
            return null;
        }
        catch (Exception exception) {
            return null;
        }
    }

    private Throwable a(Class class_, String string) {
        try {
            return (Throwable)class_.getConstructor(String.class).newInstance(string);
        }
        catch (Exception exception) {
            return null;
        }
    }

    private Throwable a(Class class_) {
        try {
            return (Throwable)class_.newInstance();
        }
        catch (Exception exception) {
            return null;
        }
    }

    public /* synthetic */ Object b(Object object) {
        return this.a((Throwable)object);
    }

    static {
        try {
            b = Throwable.class.getDeclaredField("cause");
            b.setAccessible(true);
            c = Throwable.class.getDeclaredField("detailMessage");
            c.setAccessible(true);
        }
        catch (NoSuchFieldException noSuchFieldException) {
            throw new IllegalStateException("Something is wrong with java.lang.Throwable.", noSuchFieldException);
        }
    }
}


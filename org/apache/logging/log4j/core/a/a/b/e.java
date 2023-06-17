/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.a.a.b;

import java.lang.reflect.Constructor;
import org.apache.logging.log4j.core.a.a;
import org.apache.logging.log4j.core.a.a.b.f;
import org.apache.logging.log4j.core.d;
import org.apache.logging.log4j.core.d.b;
import org.apache.logging.log4j.core.d.v;
import org.apache.logging.log4j.core.h;

public final class e
extends org.apache.logging.log4j.core.a.a.a {
    private final String a = this.a() + "{ manager=" + this.h() + " }";

    private e(String string, d d2, boolean bl2, f f2) {
        super(string, d2, bl2, f2);
    }

    @Override
    public String toString() {
        return this.a;
    }

    public static e a(String string, String string2, d d2, String string3, String string4, String string5) {
        if (v.a(string4) || v.a(string5)) {
            h.b("Attributes entityClassName and persistenceUnitName are required for JPA Appender.");
            return null;
        }
        int n2 = org.apache.logging.log4j.core.a.a.a(string3, 0);
        boolean bl2 = b.a(string2, true);
        try {
            Class<?> class_ = Class.forName(string4);
            if (!org.apache.logging.log4j.core.a.a.b.a.class.isAssignableFrom(class_)) {
                h.b("Entity class [{}] does not extend AbstractLogEventWrapperEntity.", string4);
                return null;
            }
            try {
                class_.getConstructor(new Class[0]);
            }
            catch (NoSuchMethodException noSuchMethodException) {
                h.b("Entity class [{}] does not have a no-arg constructor. The JPA provider will reject it.", string4);
                return null;
            }
            Constructor<?> constructor = class_.getConstructor(h.class);
            String string6 = "jpaManager{ description=" + string + ", bufferSize=" + n2 + ", persistenceUnitName=" + string5 + ", entityClass=" + class_.getName() + "}";
            f f2 = f.a(string6, n2, class_, constructor, string5);
            if (f2 == null) {
                return null;
            }
            return new e(string, d2, bl2, f2);
        }
        catch (ClassNotFoundException classNotFoundException) {
            h.b("Could not load entity class [{}].", string4, classNotFoundException);
            return null;
        }
        catch (NoSuchMethodException noSuchMethodException) {
            h.b("Entity class [{}] does not have a constructor with a single argument of type LogEvent.", string4);
            return null;
        }
    }
}


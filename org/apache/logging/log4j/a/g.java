/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.a;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import org.apache.logging.log4j.a.e;
import org.apache.logging.log4j.a.i;
import org.apache.logging.log4j.a.m;
import org.apache.logging.log4j.d.d;

public class g
implements i,
m {
    private static final long a = 3893703791567290742L;
    private String b;
    private transient ResourceBundle c;
    private Locale d;
    private transient d e = org.apache.logging.log4j.d.d.k();
    private String f;
    private String g;
    private String[] h;
    private transient Object[] i;
    private String j;
    private transient Throwable k;

    public g(String string, Object[] arrobject) {
        this((ResourceBundle)null, (Locale)null, string, arrobject);
    }

    public g(String string, String string2, Object[] arrobject) {
        this(string, (Locale)null, string2, arrobject);
    }

    public g(ResourceBundle resourceBundle, String string, Object[] arrobject) {
        this(resourceBundle, (Locale)null, string, arrobject);
    }

    public g(String string, Locale locale, String string2, Object[] arrobject) {
        this.g = string2;
        this.i = arrobject;
        this.k = null;
        this.a(string, null, locale);
    }

    public g(ResourceBundle resourceBundle, Locale locale, String string, Object[] arrobject) {
        this.g = string;
        this.i = arrobject;
        this.k = null;
        this.a(null, resourceBundle, locale);
    }

    public g(Locale locale, String string, Object[] arrobject) {
        this((ResourceBundle)null, locale, string, arrobject);
    }

    public g(String string, Object object) {
        this((ResourceBundle)null, (Locale)null, string, new Object[]{object});
    }

    public g(String string, String string2, Object object) {
        this(string, (Locale)null, string2, new Object[]{object});
    }

    public g(ResourceBundle resourceBundle, String string, Object object) {
        this(resourceBundle, (Locale)null, string, new Object[]{object});
    }

    public g(String string, Locale locale, String string2, Object object) {
        this(string, locale, string2, new Object[]{object});
    }

    public g(ResourceBundle resourceBundle, Locale locale, String string, Object object) {
        this(resourceBundle, locale, string, new Object[]{object});
    }

    public g(Locale locale, String string, Object object) {
        this((ResourceBundle)null, locale, string, new Object[]{object});
    }

    public g(String string, Object object, Object object2) {
        this((ResourceBundle)null, (Locale)null, string, new Object[]{object, object2});
    }

    public g(String string, String string2, Object object, Object object2) {
        this(string, (Locale)null, string2, new Object[]{object, object2});
    }

    public g(ResourceBundle resourceBundle, String string, Object object, Object object2) {
        this(resourceBundle, (Locale)null, string, new Object[]{object, object2});
    }

    public g(String string, Locale locale, String string2, Object object, Object object2) {
        this(string, locale, string2, new Object[]{object, object2});
    }

    public g(ResourceBundle resourceBundle, Locale locale, String string, Object object, Object object2) {
        this(resourceBundle, locale, string, new Object[]{object, object2});
    }

    public g(Locale locale, String string, Object object, Object object2) {
        this((ResourceBundle)null, locale, string, new Object[]{object, object2});
    }

    @Override
    public void a(String string) {
        this.f = string;
    }

    @Override
    public String e() {
        return this.f;
    }

    private void a(String string, ResourceBundle resourceBundle, Locale locale) {
        this.b = string;
        this.c = resourceBundle;
        this.d = locale;
    }

    @Override
    public String a() {
        if (this.j != null) {
            return this.j;
        }
        ResourceBundle resourceBundle = this.c;
        if (resourceBundle == null) {
            resourceBundle = this.b != null ? this.a(this.b, this.d, false) : this.a(this.f, this.d, true);
        }
        String string = this.b();
        String string2 = resourceBundle == null || !resourceBundle.containsKey(string) ? string : resourceBundle.getString(string);
        Object[] arrobject = this.i == null ? this.h : this.i;
        e e2 = new e(string2, arrobject);
        this.j = e2.a();
        this.k = e2.d();
        return this.j;
    }

    @Override
    public String b() {
        return this.g;
    }

    @Override
    public Object[] c() {
        if (this.i != null) {
            return this.i;
        }
        return this.h;
    }

    @Override
    public Throwable d() {
        return this.k;
    }

    protected ResourceBundle a(String string, Locale locale, boolean bl2) {
        int n2;
        ResourceBundle resourceBundle;
        block7: {
            resourceBundle = null;
            if (string == null) {
                return null;
            }
            try {
                resourceBundle = locale != null ? ResourceBundle.getBundle(string, locale) : ResourceBundle.getBundle(string);
            }
            catch (MissingResourceException missingResourceException) {
                if (bl2) break block7;
                this.e.a("Unable to locate ResourceBundle " + string);
                return null;
            }
        }
        String string2 = string;
        while (resourceBundle == null && (n2 = string2.lastIndexOf(46)) > 0) {
            string2 = string2.substring(0, n2);
            try {
                if (locale != null) {
                    resourceBundle = ResourceBundle.getBundle(string2, locale);
                    continue;
                }
                resourceBundle = ResourceBundle.getBundle(string2);
            }
            catch (MissingResourceException missingResourceException) {
                this.e.a("Unable to locate ResourceBundle " + string2);
            }
        }
        return resourceBundle;
    }

    private void a(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        this.a();
        objectOutputStream.writeUTF(this.j);
        objectOutputStream.writeUTF(this.g);
        objectOutputStream.writeUTF(this.b);
        objectOutputStream.writeInt(this.i.length);
        this.h = new String[this.i.length];
        int n2 = 0;
        for (Object object : this.i) {
            this.h[n2] = object.toString();
            ++n2;
        }
    }

    private void a(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.j = objectInputStream.readUTF();
        this.g = objectInputStream.readUTF();
        this.b = objectInputStream.readUTF();
        int n2 = objectInputStream.readInt();
        this.h = new String[n2];
        for (int i2 = 0; i2 < n2; ++i2) {
            this.h[i2] = objectInputStream.readUTF();
        }
        this.e = org.apache.logging.log4j.d.d.k();
        this.c = null;
        this.i = null;
    }
}


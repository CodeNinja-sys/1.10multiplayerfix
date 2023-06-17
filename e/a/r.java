/*
 * Decompiled with CFR 0.150.
 */
package e.a;

import e.a.e;
import e.a.p;
import java.util.Locale;

class r {
    public String a = "";
    public Class b;

    public r(String string, Class class_) {
        if (string != null && string.length() > 0) {
            this.a = ".*";
            for (int i2 = 0; i2 < string.length(); ++i2) {
                String string2 = string.substring(i2, i2 + 1);
                this.a = this.a + "[" + string2.toLowerCase(Locale.ENGLISH) + string2.toUpperCase(Locale.ENGLISH) + "]";
            }
            this.a = this.a + "$";
        }
        this.b = class_;
    }

    public e a() {
        if (this.b == null) {
            return null;
        }
        Object var1_1 = null;
        try {
            var1_1 = this.b.newInstance();
        }
        catch (InstantiationException instantiationException) {
            this.b();
            return null;
        }
        catch (IllegalAccessException illegalAccessException) {
            this.b();
            return null;
        }
        catch (ExceptionInInitializerError exceptionInInitializerError) {
            this.b();
            return null;
        }
        catch (SecurityException securityException) {
            this.b();
            return null;
        }
        if (var1_1 == null) {
            this.b();
            return null;
        }
        return var1_1;
    }

    private void b() {
        p.d("Unrecognized ICodec implementation in method 'getInstance'.  Ensure that the implementing class has one public, parameterless constructor.");
    }
}


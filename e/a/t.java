/*
 * Decompiled with CFR 0.150.
 */
package e.a;

public class t {
    public void a(String string, int n2) {
        String string2 = "";
        for (int i2 = 0; i2 < n2; ++i2) {
            string2 = string2 + "    ";
        }
        String string3 = string2 + string;
        System.out.println(string3);
    }

    public void b(String string, int n2) {
        String string2 = "";
        for (int i2 = 0; i2 < n2; ++i2) {
            string2 = string2 + "    ";
        }
        String string3 = string2 + string;
        System.out.println(string3);
    }

    public boolean a(boolean bl2, String string, String string2, int n2) {
        if (bl2) {
            this.a(string, string2, n2);
        }
        return bl2;
    }

    public void a(String string, String string2, int n2) {
        String string3 = "";
        for (int i2 = 0; i2 < n2; ++i2) {
            string3 = string3 + "    ";
        }
        String string4 = string3 + "Error in class '" + string + "'";
        String string5 = "    " + string3 + string2;
        System.out.println(string4);
        System.out.println(string5);
    }

    public void a(Exception exception, int n2) {
        this.b(exception, n2);
        this.b("STACK TRACE:", n2);
        if (exception == null) {
            return;
        }
        StackTraceElement[] arrstackTraceElement = exception.getStackTrace();
        if (arrstackTraceElement == null) {
            return;
        }
        for (int i2 = 0; i2 < arrstackTraceElement.length; ++i2) {
            StackTraceElement stackTraceElement = arrstackTraceElement[i2];
            if (stackTraceElement == null) continue;
            this.a(stackTraceElement.toString(), n2 + 1);
        }
    }

    public void b(Exception exception, int n2) {
        this.b("ERROR MESSAGE:", n2);
        if (exception.getMessage() == null) {
            this.a("(none)", n2 + 1);
        } else {
            this.a(exception.getMessage(), n2 + 1);
        }
    }
}


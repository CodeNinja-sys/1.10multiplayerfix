/*
 * Decompiled with CFR 0.150.
 */
package net.java.games.input;

import java.io.File;
import java.security.AccessController;
import java.util.ArrayList;
import java.util.Collection;
import java.util.StringTokenizer;
import java.util.logging.Logger;
import net.java.games.a.a.c;
import net.java.games.input.af;
import net.java.games.input.ag;
import net.java.games.input.ah;
import net.java.games.input.ai;
import net.java.games.input.q;
import net.java.games.input.t;

class ae
extends t {
    static String d;
    private static Logger g;
    private ArrayList h;
    private Collection i = new ArrayList();
    static Class e;
    static Class f;

    static void d(String string) {
        AccessController.doPrivileged(new af(string));
    }

    static String e(String string) {
        return (String)AccessController.doPrivileged(new ag(string));
    }

    static String a(String string, String string2) {
        return (String)AccessController.doPrivileged(new ah(string, string2));
    }

    public q[] a() {
        Object object;
        Object object2;
        if (this.h == null) {
            this.h = new ArrayList();
            AccessController.doPrivileged(new ai(this));
            object2 = ae.a("jinput.plugins", "") + " " + ae.a("net.java.games.input.plugins", "");
            if (!ae.a("jinput.useDefaultPlugin", "true").toLowerCase().trim().equals("false") && !ae.a("net.java.games.input.useDefaultPlugin", "true").toLowerCase().trim().equals("false")) {
                object = ae.a("os.name", "").trim();
                if (((String)object).equals("Linux")) {
                    object2 = (String)object2 + " net.java.games.input.LinuxEnvironmentPlugin";
                } else if (((String)object).equals("Mac OS X")) {
                    object2 = (String)object2 + " net.java.games.input.OSXEnvironmentPlugin";
                } else if (((String)object).equals("Windows XP") || ((String)object).equals("Windows Vista") || ((String)object).equals("Windows 7")) {
                    object2 = (String)object2 + " net.java.games.input.DirectAndRawInputEnvironmentPlugin";
                } else if (((String)object).equals("Windows 98") || ((String)object).equals("Windows 2000")) {
                    object2 = (String)object2 + " net.java.games.input.DirectInputEnvironmentPlugin";
                } else if (((String)object).startsWith("Windows")) {
                    g.warning("Found unknown Windows version: " + (String)object);
                    g.info("Attempting to use default windows plug-in.");
                    object2 = (String)object2 + " net.java.games.input.DirectAndRawInputEnvironmentPlugin";
                } else {
                    g.info("Trying to use default plugin, OS name " + (String)object + " not recognised");
                }
            }
            object = new StringTokenizer((String)object2, " \t\n\r\f,;:");
            while (((StringTokenizer)object).hasMoreTokens()) {
                String string = ((StringTokenizer)object).nextToken();
                try {
                    if (this.i.contains(string)) continue;
                    g.info("Loading: " + string);
                    Class<?> class_ = Class.forName(string);
                    t t2 = (t)class_.newInstance();
                    if (t2.b()) {
                        this.a(t2.a());
                        this.i.add(t2.getClass().getName());
                        continue;
                    }
                    ae.a(class_.getName() + " is not supported");
                }
                catch (Throwable throwable) {
                    throwable.printStackTrace();
                }
            }
        }
        object2 = new q[this.h.size()];
        object = this.h.iterator();
        int n2 = 0;
        while (object.hasNext()) {
            object2[n2] = (q)object.next();
            ++n2;
        }
        return object2;
    }

    private void d() {
        String string = ae.e("jinput.controllerPluginPath");
        if (string == null) {
            string = "controller";
        }
        this.g(ae.e("java.home") + File.separator + "lib" + File.separator + string);
        this.g(ae.e("user.dir") + File.separator + string);
    }

    private void g(String string) {
        File file = new File(string);
        if (!file.exists()) {
            return;
        }
        try {
            c c2 = new c(file);
            Class[] arrclass = c2.a(f == null ? (f = ae.f("net.java.games.input.t")) : f);
            for (int i2 = 0; i2 < arrclass.length; ++i2) {
                try {
                    t.a("ControllerEnvironment " + arrclass[i2].getName() + " loaded by " + arrclass[i2].getClassLoader());
                    t t2 = (t)arrclass[i2].newInstance();
                    if (t2.b()) {
                        this.a(t2.a());
                        this.i.add(t2.getClass().getName());
                        continue;
                    }
                    ae.a(arrclass[i2].getName() + " is not supported");
                    continue;
                }
                catch (Throwable throwable) {
                    throwable.printStackTrace();
                }
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private void a(q[] arrq) {
        for (int i2 = 0; i2 < arrq.length; ++i2) {
            this.h.add(arrq[i2]);
        }
    }

    public boolean b() {
        return true;
    }

    static Class f(String string) {
        try {
            return Class.forName(string);
        }
        catch (ClassNotFoundException classNotFoundException) {
            throw new NoClassDefFoundError().initCause(classNotFoundException);
        }
    }

    static void a(ae ae2) {
        ae2.d();
    }

    static {
        g = Logger.getLogger((e == null ? (e = ae.f("net.java.games.input.ae")) : e).getName());
    }
}


/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

import com.ibm.icu.a.ar;
import com.ibm.icu.a.ep;
import com.ibm.icu.a.jd;
import com.ibm.icu.util.dn;
import com.ibm.icu.util.dv;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.security.AccessController;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.MissingResourceException;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;

public class eo
extends dv {
    private ResourceBundle a = null;
    private String b = null;
    private String c = null;
    private List d = null;
    private static final boolean e = ar.b("resourceBundleWrapper");

    private eo(ResourceBundle resourceBundle) {
        this.a = resourceBundle;
    }

    protected void a(int n2) {
    }

    protected Object handleGetObject(String string) {
        Object object = null;
        for (eo eo2 = this; eo2 != null; eo2 = (eo)eo2.j()) {
            try {
                object = eo2.a.getObject(string);
                break;
            }
            catch (MissingResourceException missingResourceException) {
                continue;
            }
        }
        if (object == null) {
            throw new MissingResourceException("Can't find resource for bundle " + this.c + ", key " + string, this.getClass().getName(), string);
        }
        return object;
    }

    public Enumeration getKeys() {
        return Collections.enumeration(this.d);
    }

    private void a() {
        this.d = new ArrayList();
        for (eo eo2 = this; eo2 != null; eo2 = (eo)eo2.j()) {
            Enumeration<String> enumeration = eo2.a.getKeys();
            while (enumeration.hasMoreElements()) {
                String string = enumeration.nextElement();
                if (this.d.contains(string)) continue;
                this.d.add(string);
            }
        }
    }

    protected String g() {
        return this.b;
    }

    protected String h() {
        return this.a.getClass().getName().replace('.', '/');
    }

    public dn i() {
        return new dn(this.b);
    }

    public dv j() {
        return (dv)this.parent;
    }

    public static dv a(String string, String string2, ClassLoader classLoader, boolean bl2) {
        dv dv2 = eo.b(string, string2, classLoader, bl2);
        if (dv2 == null) {
            String string3 = "_";
            if (string.indexOf(47) >= 0) {
                string3 = "/";
            }
            throw new MissingResourceException("Could not find the bundle " + string + string3 + string2, "", "");
        }
        return dv2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    protected static synchronized dv b(String string, String string2, ClassLoader classLoader, boolean bl2) {
        eo eo2;
        if (classLoader == null) {
            classLoader = jd.a();
        }
        ClassLoader classLoader2 = classLoader;
        String string3 = string;
        dn dn2 = dn.b();
        if (string2.length() != 0) {
            string3 = string3 + "_" + string2;
        }
        if ((eo2 = (eo)eo.a(classLoader2, string3, dn2)) == null) {
            block35: {
                Object object;
                Object object2;
                boolean bl3;
                eo eo3;
                block33: {
                    eo3 = null;
                    int n2 = string2.lastIndexOf(95);
                    bl3 = false;
                    if (n2 != -1) {
                        object2 = string2.substring(0, n2);
                        eo3 = (eo)eo.a(classLoader2, string + "_" + (String)object2, dn2);
                        if (eo3 == null) {
                            eo3 = (eo)eo.b(string, (String)object2, classLoader2, bl2);
                        }
                    } else if (string2.length() > 0 && (eo3 = (eo)eo.a(classLoader2, string, dn2)) == null) {
                        eo3 = (eo)eo.b(string, "", classLoader2, bl2);
                    }
                    try {
                        object2 = classLoader2.loadClass(string3).asSubclass(ResourceBundle.class);
                        object = (ResourceBundle)((Class)object2).newInstance();
                        eo2 = new eo((ResourceBundle)object);
                        if (eo3 != null) {
                            eo2.setParent(eo3);
                        }
                        eo2.c = string;
                        eo2.b = string2;
                    }
                    catch (ClassNotFoundException classNotFoundException) {
                        bl3 = true;
                    }
                    catch (NoClassDefFoundError noClassDefFoundError) {
                        bl3 = true;
                    }
                    catch (Exception exception) {
                        if (e) {
                            System.out.println("failure");
                        }
                        if (!e) break block33;
                        System.out.println(exception);
                    }
                }
                if (bl3) {
                    try {
                        block34: {
                            object2 = string3.replace('.', '/') + ".properties";
                            object = (InputStream)AccessController.doPrivileged(new ep(classLoader2, (String)object2));
                            if (object != null) {
                                object = new BufferedInputStream((InputStream)object);
                                eo2 = new eo(new PropertyResourceBundle((InputStream)object));
                                if (eo3 != null) {
                                    eo2.setParent(eo3);
                                }
                                eo2.c = string;
                                eo2.b = string2;
                                try {
                                    ((InputStream)object).close();
                                }
                                catch (Exception exception) {}
                                break block34;
                                catch (Exception exception) {
                                    try {
                                        ((InputStream)object).close();
                                    }
                                    catch (Exception exception2) {}
                                    catch (Throwable throwable) {
                                        try {
                                            ((InputStream)object).close();
                                            throw throwable;
                                        }
                                        catch (Exception exception3) {
                                            // empty catch block
                                        }
                                        throw throwable;
                                    }
                                }
                            }
                        }
                        if (eo2 == null) {
                            String string4 = dn2.toString();
                            if (string2.length() > 0 && string2.indexOf(95) < 0 && string4.indexOf(string2) == -1 && (eo2 = (eo)eo.a(classLoader2, string + "_" + string4, dn2)) == null) {
                                eo2 = (eo)eo.b(string, string4, classLoader2, bl2);
                            }
                        }
                        if (eo2 == null) {
                            eo2 = eo3;
                        }
                    }
                    catch (Exception exception) {
                        if (e) {
                            System.out.println("failure");
                        }
                        if (!e) break block35;
                        System.out.println(exception);
                    }
                }
            }
            eo2 = (eo)eo.a(classLoader2, string3, dn2, eo2);
        }
        if (eo2 != null) {
            eo2.a();
            return eo2;
        }
        if (!e) return eo2;
        System.out.println("Returning null for " + string + "_" + string2);
        return eo2;
    }
}


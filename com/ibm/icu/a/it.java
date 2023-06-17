/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

import com.ibm.icu.a.ar;
import com.ibm.icu.a.iu;
import com.ibm.icu.a.iv;
import com.ibm.icu.a.iw;
import com.ibm.icu.a.jd;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public abstract class it {
    public static final String a = "urlhandler.props";
    private static final Map b;
    private static final boolean c;

    public static it a(URL uRL) {
        block9: {
            Method method;
            if (uRL == null) {
                return null;
            }
            String string = uRL.getProtocol();
            if (b != null && (method = (Method)b.get(string)) != null) {
                try {
                    it it2 = (it)method.invoke(null, uRL);
                    if (it2 != null) {
                        return it2;
                    }
                }
                catch (IllegalAccessException illegalAccessException) {
                    if (c) {
                        System.err.println(illegalAccessException);
                    }
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    if (c) {
                        System.err.println(illegalArgumentException);
                    }
                }
                catch (InvocationTargetException invocationTargetException) {
                    if (!c) break block9;
                    System.err.println(invocationTargetException);
                }
            }
        }
        return it.b(uRL);
    }

    protected static it b(URL uRL) {
        it it2 = null;
        String string = uRL.getProtocol();
        try {
            if (string.equals("file")) {
                it2 = new iu(uRL);
            } else if (string.equals("jar") || string.equals("wsjar")) {
                it2 = new iv(uRL);
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        return it2;
    }

    public void a(iw iw2, boolean bl2) {
        this.a(iw2, bl2, true);
    }

    public abstract void a(iw var1, boolean var2, boolean var3);

    static /* synthetic */ boolean a() {
        return c;
    }

    static {
        HashMap<String, Method> hashMap;
        block13: {
            c = ar.b("URLHandler");
            hashMap = null;
            try {
                Class[] arrclass;
                InputStream inputStream = it.class.getResourceAsStream("urlhandler.props");
                if (inputStream == null) {
                    arrclass = jd.a();
                    inputStream = arrclass.getResourceAsStream("urlhandler.props");
                }
                if (inputStream == null) break block13;
                arrclass = new Class[]{URL.class};
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                String string = bufferedReader.readLine();
                while (string != null) {
                    block14: {
                        if ((string = string.trim()).length() != 0 && string.charAt(0) != '#') {
                            int n2 = string.indexOf(61);
                            if (n2 == -1) {
                                if (!c) break;
                                System.err.println("bad urlhandler line: '" + string + "'");
                                break;
                            }
                            String string2 = string.substring(0, n2).trim();
                            String string3 = string.substring(n2 + 1).trim();
                            try {
                                Class<?> class_ = Class.forName(string3);
                                Method method = class_.getDeclaredMethod("get", arrclass);
                                if (hashMap == null) {
                                    hashMap = new HashMap<String, Method>();
                                }
                                hashMap.put(string2, method);
                            }
                            catch (ClassNotFoundException classNotFoundException) {
                                if (c) {
                                    System.err.println(classNotFoundException);
                                }
                            }
                            catch (NoSuchMethodException noSuchMethodException) {
                                if (c) {
                                    System.err.println(noSuchMethodException);
                                }
                            }
                            catch (SecurityException securityException) {
                                if (!c) break block14;
                                System.err.println(securityException);
                            }
                        }
                    }
                    string = bufferedReader.readLine();
                }
                bufferedReader.close();
            }
            catch (Throwable throwable) {
                if (!c) break block13;
                System.err.println(throwable);
            }
        }
        b = hashMap;
    }
}


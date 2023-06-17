/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.d;

import java.util.Locale;
import java.util.Properties;
import org.apache.logging.log4j.core.d.p;
import org.apache.logging.log4j.d;
import org.apache.logging.log4j.e.b;

public final class t {
    private static final d a = org.apache.logging.log4j.d.d.k();
    private static final String b = "${";
    private static final char c = '}';
    private static final int d = 2;
    private static final int e = 1;
    private static final int f = 1024;

    private t() {
    }

    public static String[] a(String[] arrstring, String[] arrstring2) {
        int n2 = arrstring.length + arrstring2.length;
        String[] arrstring3 = new String[n2];
        System.arraycopy(arrstring, 0, arrstring3, 0, arrstring.length);
        System.arraycopy(arrstring2, 0, arrstring3, arrstring.length, arrstring2.length);
        return arrstring3;
    }

    public static String a(String string) {
        int n2 = string.length();
        StringBuilder stringBuilder = new StringBuilder(n2);
        int n3 = 0;
        while (n3 < n2) {
            int n4;
            if ((n4 = string.charAt(n3++)) == 92) {
                if ((n4 = string.charAt(n3++)) == 110) {
                    n4 = 10;
                } else if (n4 == 114) {
                    n4 = 13;
                } else if (n4 == 116) {
                    n4 = 9;
                } else if (n4 == 102) {
                    n4 = 12;
                } else if (n4 == 8) {
                    n4 = 8;
                } else if (n4 == 34) {
                    n4 = 34;
                } else if (n4 == 39) {
                    n4 = 39;
                } else if (n4 == 92) {
                    n4 = 92;
                }
            }
            stringBuilder.append((char)n4);
        }
        return stringBuilder.toString();
    }

    public static Object a(Properties properties, String string, Class class_, Object object) {
        String string2 = t.a(string, properties);
        if (string2 == null) {
            a.b("Could not find value for key " + string);
            return object;
        }
        return t.a(string2.trim(), class_, object);
    }

    public static boolean a(String string, boolean bl2) {
        if (string == null) {
            return bl2;
        }
        String string2 = string.trim();
        if ("true".equalsIgnoreCase(string2)) {
            return true;
        }
        if ("false".equalsIgnoreCase(string2)) {
            return false;
        }
        return bl2;
    }

    public static int a(String string, int n2) {
        if (string != null) {
            String string2 = string.trim();
            try {
                return Integer.parseInt(string2);
            }
            catch (NumberFormatException numberFormatException) {
                a.b("[" + string2 + "] is not in proper int form.");
                numberFormatException.printStackTrace();
            }
        }
        return n2;
    }

    public static long a(String string, long l2) {
        if (string == null) {
            return l2;
        }
        String string2 = string.trim().toUpperCase(Locale.ENGLISH);
        long l3 = 1L;
        int n2 = string2.indexOf("KB");
        if (n2 != -1) {
            l3 = 1024L;
            string2 = string2.substring(0, n2);
        } else {
            n2 = string2.indexOf("MB");
            if (n2 != -1) {
                l3 = 0x100000L;
                string2 = string2.substring(0, n2);
            } else {
                n2 = string2.indexOf("GB");
                if (n2 != -1) {
                    l3 = 0x40000000L;
                    string2 = string2.substring(0, n2);
                }
            }
        }
        if (string2 != null) {
            try {
                return Long.parseLong(string2) * l3;
            }
            catch (NumberFormatException numberFormatException) {
                a.b("[" + string2 + "] is not in proper int form.");
                a.b("[" + string + "] not in expected format.", (Throwable)numberFormatException);
            }
        }
        return l2;
    }

    public static String a(String string, Properties properties) {
        String string2 = properties.getProperty(string);
        if (string2 == null) {
            return null;
        }
        try {
            return t.b(string2, properties);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            a.b("Bad option value [" + string2 + "].", (Throwable)illegalArgumentException);
            return string2;
        }
    }

    public static Object a(String string, Class class_, Object object) {
        if (string != null) {
            try {
                Class class_2 = p.a(string);
                if (!class_.isAssignableFrom(class_2)) {
                    a.b("A \"" + string + "\" object is not assignable to a \"" + class_.getName() + "\" variable.");
                    a.b("The class \"" + class_.getName() + "\" was loaded by ");
                    a.b("[" + class_.getClassLoader() + "] whereas object of type ");
                    a.b("\"" + class_2.getName() + "\" was loaded by [" + class_2.getClassLoader() + "].");
                    return object;
                }
                return class_2.newInstance();
            }
            catch (ClassNotFoundException classNotFoundException) {
                a.b("Could not instantiate class [" + string + "].", (Throwable)classNotFoundException);
            }
            catch (IllegalAccessException illegalAccessException) {
                a.b("Could not instantiate class [" + string + "].", (Throwable)illegalAccessException);
            }
            catch (InstantiationException instantiationException) {
                a.b("Could not instantiate class [" + string + "].", (Throwable)instantiationException);
            }
            catch (RuntimeException runtimeException) {
                a.b("Could not instantiate class [" + string + "].", (Throwable)runtimeException);
            }
        }
        return object;
    }

    public static String b(String string, Properties properties) {
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = 0;
        while (true) {
            int n3;
            if ((n3 = string.indexOf(b, n2)) == -1) {
                if (n2 == 0) {
                    return string;
                }
                stringBuilder.append(string.substring(n2, string.length()));
                return stringBuilder.toString();
            }
            stringBuilder.append(string.substring(n2, n3));
            int n4 = string.indexOf(125, n3);
            if (n4 == -1) {
                throw new IllegalArgumentException('\"' + string + "\" has no closing brace. Opening brace at position " + n3 + '.');
            }
            String string2 = string.substring(n3 += 2, n4);
            String string3 = org.apache.logging.log4j.e.b.a().a(string2, null);
            if (string3 == null && properties != null) {
                string3 = properties.getProperty(string2);
            }
            if (string3 != null) {
                String string4 = t.b(string3, properties);
                stringBuilder.append(string4);
            }
            n2 = n4 + 1;
        }
    }
}


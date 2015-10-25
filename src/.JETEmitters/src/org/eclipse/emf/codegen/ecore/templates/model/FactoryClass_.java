package org.eclipse.emf.codegen.ecore.templates.model;

import java.util.*;
import org.eclipse.emf.codegen.ecore.genmodel.*;

public class FactoryClass_
{
  protected static String nl;
  public static synchronized FactoryClass_ create(String lineSeparator)
  {
    nl = lineSeparator;
    FactoryClass_ result = new FactoryClass_();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = "/**" + NL + "* NPNtool: Nested Petri Nets toolset." + NL + "*" + NL + "* Copyright (c) 2013 Leonid Dworzanski. All rights reserved." + NL + "*" + NL + "*/" + NL;
  protected final String TEXT_3 = NL + "package ";
  protected final String TEXT_4 = ";";
  protected final String TEXT_5 = NL + "package ";
  protected final String TEXT_6 = ";";
  protected final String TEXT_7 = NL;
  protected final String TEXT_8 = NL;
  protected final String TEXT_9 = NL + "/**" + NL + " * <!-- begin-user-doc -->" + NL + " * The <b>Factory</b> for the model." + NL + " * It provides a create method for each non-abstract class of the model." + NL + " * <!-- end-user-doc -->";
  protected final String TEXT_10 = NL + " * @see ";
  protected final String TEXT_11 = NL + " * @generated" + NL + " */";
  protected final String TEXT_12 = NL + "/**" + NL + " * <!-- begin-user-doc -->" + NL + " * An implementation of the model <b>Factory</b>." + NL + " * <!-- end-user-doc -->" + NL + " * @generated" + NL + " */";
  protected final String TEXT_13 = NL + "public class ";
  protected final String TEXT_14 = " extends ";
  protected final String TEXT_15 = " implements ";
  protected final String TEXT_16 = NL + "public interface ";
  protected final String TEXT_17 = " extends ";
  protected final String TEXT_18 = NL + "{";
  protected final String TEXT_19 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\t";
  protected final String TEXT_20 = " copyright = ";
  protected final String TEXT_21 = ";";
  protected final String TEXT_22 = NL;
  protected final String TEXT_23 = NL + "\t/**" + NL + "\t * The singleton instance of the factory." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\t";
  protected final String TEXT_24 = " eINSTANCE = init();" + NL;
  protected final String TEXT_25 = NL + "\t/**" + NL + "\t * The singleton instance of the factory." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\t";
  protected final String TEXT_26 = " INSTANCE = ";
  protected final String TEXT_27 = ".eINSTANCE;" + NL;
  protected final String TEXT_28 = NL + "\t/**" + NL + "\t * The singleton instance of the factory." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\t";
  protected final String TEXT_29 = " eINSTANCE = ";
  protected final String TEXT_30 = ".init();" + NL;
  protected final String TEXT_31 = NL + "\t/**" + NL + "\t * Creates the default factory implementation." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_32 = NL + "\tpublic static ";
  protected final String TEXT_33 = " init()" + NL + "\t{" + NL + "\t\ttry" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_34 = " the";
  protected final String TEXT_35 = " = (";
  protected final String TEXT_36 = ")";
  protected final String TEXT_37 = ".Registry.INSTANCE.getEFactory(\"";
  protected final String TEXT_38 = "\");";
  protected final String TEXT_39 = " " + NL + "\t\t\tif (the";
  protected final String TEXT_40 = " != null)" + NL + "\t\t\t{" + NL + "\t\t\t\treturn the";
  protected final String TEXT_41 = ";" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t\tcatch (Exception exception)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_42 = ".INSTANCE.log(exception);" + NL + "\t\t}" + NL + "\t\treturn new ";
  protected final String TEXT_43 = "();" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * Creates an instance of the factory." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_44 = "()" + NL + "\t{" + NL + "\t\tsuper();" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_45 = NL + "\t@Override";
  protected final String TEXT_46 = NL + "\tpublic EObject create(EClass eClass)" + NL + "\t{" + NL + "\t\tswitch (eClass.getClassifierID())" + NL + "\t\t{";
  protected final String TEXT_47 = NL + "\t\t\tcase ";
  protected final String TEXT_48 = ".";
  protected final String TEXT_49 = ": return ";
  protected final String TEXT_50 = "create";
  protected final String TEXT_51 = "();";
  protected final String TEXT_52 = NL + "\t\t\tdefault:" + NL + "\t\t\t\tthrow new IllegalArgumentException(\"The class '\" + eClass.getName() + \"' is not a valid classifier\");";
  protected final String TEXT_53 = NL + "\t\t}" + NL + "\t}" + NL;
  protected final String TEXT_54 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_55 = NL + "\t@Override";
  protected final String TEXT_56 = NL + "\tpublic Object createFromString(";
  protected final String TEXT_57 = " eDataType, String initialValue)" + NL + "\t{" + NL + "\t\tswitch (eDataType.getClassifierID())" + NL + "\t\t{";
  protected final String TEXT_58 = NL + "\t\t\tcase ";
  protected final String TEXT_59 = ".";
  protected final String TEXT_60 = ":" + NL + "\t\t\t\treturn create";
  protected final String TEXT_61 = "FromString(eDataType, initialValue);";
  protected final String TEXT_62 = NL + "\t\t\tdefault:" + NL + "\t\t\t\tthrow new IllegalArgumentException(\"The datatype '\" + eDataType.getName() + \"' is not a valid classifier\");";
  protected final String TEXT_63 = NL + "\t\t}" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_64 = NL + "\t@Override";
  protected final String TEXT_65 = NL + "\tpublic String convertToString(";
  protected final String TEXT_66 = " eDataType, Object instanceValue)" + NL + "\t{" + NL + "\t\tswitch (eDataType.getClassifierID())" + NL + "\t\t{";
  protected final String TEXT_67 = NL + "\t\t\tcase ";
  protected final String TEXT_68 = ".";
  protected final String TEXT_69 = ":" + NL + "\t\t\t\treturn convert";
  protected final String TEXT_70 = "ToString(eDataType, instanceValue);";
  protected final String TEXT_71 = NL + "\t\t\tdefault:" + NL + "\t\t\t\tthrow new IllegalArgumentException(\"The datatype '\" + eDataType.getName() + \"' is not a valid classifier\");";
  protected final String TEXT_72 = NL + "\t\t}" + NL + "\t}" + NL;
  protected final String TEXT_73 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_74 = " create";
  protected final String TEXT_75 = "()" + NL + "\t{";
  protected final String TEXT_76 = NL + "\t\t";
  protected final String TEXT_77 = " ";
  protected final String TEXT_78 = " = ";
  protected final String TEXT_79 = "super.create(";
  protected final String TEXT_80 = ");";
  protected final String TEXT_81 = NL + "\t\t";
  protected final String TEXT_82 = " ";
  protected final String TEXT_83 = " = new ";
  protected final String TEXT_84 = "()";
  protected final String TEXT_85 = "{}";
  protected final String TEXT_86 = ";";
  protected final String TEXT_87 = NL + "\t\treturn ";
  protected final String TEXT_88 = ";" + NL + "\t}" + NL;
  protected final String TEXT_89 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_90 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_91 = NL + "\tpublic ";
  protected final String TEXT_92 = " create";
  protected final String TEXT_93 = "(String ";
  protected final String TEXT_94 = "it";
  protected final String TEXT_95 = "literal";
  protected final String TEXT_96 = ")" + NL + "\t{";
  protected final String TEXT_97 = NL + "\t\t";
  protected final String TEXT_98 = NL + "\t\t";
  protected final String TEXT_99 = " result = ";
  protected final String TEXT_100 = ".get(literal);" + NL + "\t\tif (result == null) throw new IllegalArgumentException(\"The value '\" + literal + \"' is not a valid enumerator of '\" + ";
  protected final String TEXT_101 = ".getName() + \"'\");";
  protected final String TEXT_102 = NL + "\t\treturn result;";
  protected final String TEXT_103 = NL + "\t\treturn new ";
  protected final String TEXT_104 = "(create";
  protected final String TEXT_105 = "(literal));";
  protected final String TEXT_106 = NL + "\t\treturn create";
  protected final String TEXT_107 = "(literal);";
  protected final String TEXT_108 = NL + "\t\treturn new ";
  protected final String TEXT_109 = "(";
  protected final String TEXT_110 = ".create";
  protected final String TEXT_111 = "(literal));";
  protected final String TEXT_112 = NL + "\t\treturn ";
  protected final String TEXT_113 = ".create";
  protected final String TEXT_114 = "(literal);";
  protected final String TEXT_115 = NL + "\t\treturn ";
  protected final String TEXT_116 = "(";
  protected final String TEXT_117 = ")";
  protected final String TEXT_118 = ".createFromString(";
  protected final String TEXT_119 = ", literal);";
  protected final String TEXT_120 = NL + "\t\tif (literal == null) return null;" + NL + "\t\t";
  protected final String TEXT_121 = " result = new ";
  protected final String TEXT_122 = "<";
  protected final String TEXT_123 = ">";
  protected final String TEXT_124 = "();";
  protected final String TEXT_125 = NL + "\t\tfor (";
  protected final String TEXT_126 = " stringTokenizer = new ";
  protected final String TEXT_127 = "(literal); stringTokenizer.hasMoreTokens(); )";
  protected final String TEXT_128 = NL + "\t\tfor (String item : split(literal))";
  protected final String TEXT_129 = NL + "\t\t{";
  protected final String TEXT_130 = NL + "\t\t\tString item = stringTokenizer.nextToken();";
  protected final String TEXT_131 = NL + "\t\t\tresult.add(create";
  protected final String TEXT_132 = "(item));";
  protected final String TEXT_133 = NL + "\t\t\tresult.add(create";
  protected final String TEXT_134 = "FromString(";
  protected final String TEXT_135 = ", item));";
  protected final String TEXT_136 = NL + "\t\t\tresult.add(";
  protected final String TEXT_137 = ".create";
  protected final String TEXT_138 = "(item));";
  protected final String TEXT_139 = NL + "\t\t\tresult.add(";
  protected final String TEXT_140 = ".createFromString(";
  protected final String TEXT_141 = ", item));";
  protected final String TEXT_142 = NL + "\t\t}" + NL + "\t\treturn result;";
  protected final String TEXT_143 = NL + "\t\tif (literal == null) return ";
  protected final String TEXT_144 = ";" + NL + "\t\t";
  protected final String TEXT_145 = " result = ";
  protected final String TEXT_146 = ";" + NL + "\t\tRuntimeException exception = null;";
  protected final String TEXT_147 = NL + "\t\ttry" + NL + "\t\t{";
  protected final String TEXT_148 = NL + "\t\t\tresult = create";
  protected final String TEXT_149 = "(literal);";
  protected final String TEXT_150 = NL + "\t\t\tresult = (";
  protected final String TEXT_151 = ")create";
  protected final String TEXT_152 = "FromString(";
  protected final String TEXT_153 = ", literal);";
  protected final String TEXT_154 = NL + "\t\t\tresult = ";
  protected final String TEXT_155 = ".create";
  protected final String TEXT_156 = "(literal);";
  protected final String TEXT_157 = NL + "\t\t\tresult = (";
  protected final String TEXT_158 = ")";
  protected final String TEXT_159 = ".createFromString(";
  protected final String TEXT_160 = ", literal);";
  protected final String TEXT_161 = NL + "\t\t\tif (";
  protected final String TEXT_162 = "result != null && ";
  protected final String TEXT_163 = ".INSTANCE.validate(";
  protected final String TEXT_164 = ", ";
  protected final String TEXT_165 = "new ";
  protected final String TEXT_166 = "(result)";
  protected final String TEXT_167 = "result";
  protected final String TEXT_168 = ", null, null))" + NL + "\t\t\t{" + NL + "\t\t\t\treturn result;" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t\tcatch (RuntimeException e)" + NL + "\t\t{" + NL + "\t\t\texception = e;" + NL + "\t\t}";
  protected final String TEXT_169 = NL + "\t\tif (";
  protected final String TEXT_170 = "result != null || ";
  protected final String TEXT_171 = "exception == null) return result;" + NL + "    " + NL + "\t\tthrow exception;";
  protected final String TEXT_172 = NL + "\t\treturn (";
  protected final String TEXT_173 = ")super.createFromString(literal);";
  protected final String TEXT_174 = NL + "\t\t// TODO: implement this method" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new ";
  protected final String TEXT_175 = "();";
  protected final String TEXT_176 = NL + "\t\treturn ((";
  protected final String TEXT_177 = ")super.createFromString(";
  protected final String TEXT_178 = ", literal)).";
  protected final String TEXT_179 = "();";
  protected final String TEXT_180 = NL + "\t\treturn ";
  protected final String TEXT_181 = "(";
  protected final String TEXT_182 = ")";
  protected final String TEXT_183 = "super.createFromString(";
  protected final String TEXT_184 = ", literal);";
  protected final String TEXT_185 = NL + "\t}" + NL;
  protected final String TEXT_186 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_187 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_188 = NL + "\tpublic ";
  protected final String TEXT_189 = " create";
  protected final String TEXT_190 = "FromString(";
  protected final String TEXT_191 = " eDataType, String initialValue)" + NL + "\t{";
  protected final String TEXT_192 = NL + "\t\treturn create";
  protected final String TEXT_193 = "(initialValue);";
  protected final String TEXT_194 = NL + "\t\t";
  protected final String TEXT_195 = " result = ";
  protected final String TEXT_196 = ".get(initialValue);" + NL + "\t\tif (result == null) throw new IllegalArgumentException(\"The value '\" + initialValue + \"' is not a valid enumerator of '\" + eDataType.getName() + \"'\");";
  protected final String TEXT_197 = NL + "\t\treturn result;";
  protected final String TEXT_198 = NL + "\t\treturn ";
  protected final String TEXT_199 = "(";
  protected final String TEXT_200 = ")";
  protected final String TEXT_201 = "create";
  protected final String TEXT_202 = "FromString(";
  protected final String TEXT_203 = ", initialValue);";
  protected final String TEXT_204 = NL + "\t\treturn ";
  protected final String TEXT_205 = "(";
  protected final String TEXT_206 = ")";
  protected final String TEXT_207 = ".createFromString(";
  protected final String TEXT_208 = ", initialValue);";
  protected final String TEXT_209 = NL + "\t\treturn create";
  protected final String TEXT_210 = "(initialValue);";
  protected final String TEXT_211 = NL + "\t\tif (initialValue == null) return null;" + NL + "\t\t";
  protected final String TEXT_212 = " result = new ";
  protected final String TEXT_213 = "<";
  protected final String TEXT_214 = ">";
  protected final String TEXT_215 = "();";
  protected final String TEXT_216 = NL + "\t\tfor (";
  protected final String TEXT_217 = " stringTokenizer = new ";
  protected final String TEXT_218 = "(initialValue); stringTokenizer.hasMoreTokens(); )";
  protected final String TEXT_219 = NL + "\t\tfor (String item : split(initialValue))";
  protected final String TEXT_220 = NL + "\t\t{";
  protected final String TEXT_221 = NL + "\t\t\tString item = stringTokenizer.nextToken();";
  protected final String TEXT_222 = NL + "\t\t\tresult.add(create";
  protected final String TEXT_223 = "FromString(";
  protected final String TEXT_224 = ", item));";
  protected final String TEXT_225 = NL + "\t\t\tresult.add(";
  protected final String TEXT_226 = "(";
  protected final String TEXT_227 = ")";
  protected final String TEXT_228 = ".createFromString(";
  protected final String TEXT_229 = ", item));";
  protected final String TEXT_230 = NL + "\t\t}" + NL + "\t\treturn result;";
  protected final String TEXT_231 = NL + "\t\treturn new ";
  protected final String TEXT_232 = "(create";
  protected final String TEXT_233 = "(initialValue));";
  protected final String TEXT_234 = NL + "\t\treturn create";
  protected final String TEXT_235 = "(initialValue);";
  protected final String TEXT_236 = NL + "\t\tif (initialValue == null) return null;" + NL + "\t\t";
  protected final String TEXT_237 = " result = null;" + NL + "\t\tRuntimeException exception = null;";
  protected final String TEXT_238 = NL + "\t\ttry" + NL + "\t\t{";
  protected final String TEXT_239 = NL + "\t\t\tresult = ";
  protected final String TEXT_240 = "(";
  protected final String TEXT_241 = ")";
  protected final String TEXT_242 = "create";
  protected final String TEXT_243 = "FromString(";
  protected final String TEXT_244 = ", initialValue);";
  protected final String TEXT_245 = NL + "\t\t\tresult = ";
  protected final String TEXT_246 = "(";
  protected final String TEXT_247 = ")";
  protected final String TEXT_248 = ".createFromString(";
  protected final String TEXT_249 = ", initialValue);";
  protected final String TEXT_250 = NL + "\t\t\tif (result != null && ";
  protected final String TEXT_251 = ".INSTANCE.validate(eDataType, result, null, null))" + NL + "\t\t\t{" + NL + "\t\t\t\treturn result;" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t\tcatch (RuntimeException e)" + NL + "\t\t{" + NL + "\t\t\texception = e;" + NL + "\t\t}";
  protected final String TEXT_252 = NL + "\t\tif (result != null || exception == null) return result;" + NL + "    " + NL + "\t\tthrow exception;";
  protected final String TEXT_253 = NL + "\t\treturn create";
  protected final String TEXT_254 = "(initialValue);";
  protected final String TEXT_255 = NL + "\t\treturn ";
  protected final String TEXT_256 = "(";
  protected final String TEXT_257 = ")";
  protected final String TEXT_258 = "super.createFromString(initialValue);";
  protected final String TEXT_259 = NL + "\t\t// TODO: implement this method" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new ";
  protected final String TEXT_260 = "();";
  protected final String TEXT_261 = NL + "\t\treturn ";
  protected final String TEXT_262 = "(";
  protected final String TEXT_263 = ")";
  protected final String TEXT_264 = "super.createFromString(eDataType, initialValue);";
  protected final String TEXT_265 = NL + "\t}" + NL;
  protected final String TEXT_266 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic String convert";
  protected final String TEXT_267 = "(";
  protected final String TEXT_268 = " ";
  protected final String TEXT_269 = "it";
  protected final String TEXT_270 = "instanceValue";
  protected final String TEXT_271 = ")" + NL + "\t{";
  protected final String TEXT_272 = NL + "\t\t";
  protected final String TEXT_273 = NL + "\t\treturn instanceValue == null ? null : instanceValue.toString();";
  protected final String TEXT_274 = NL + "\t\treturn instanceValue == null ? null : convert";
  protected final String TEXT_275 = "(instanceValue";
  protected final String TEXT_276 = ".";
  protected final String TEXT_277 = "()";
  protected final String TEXT_278 = ");";
  protected final String TEXT_279 = NL + "\t\treturn convert";
  protected final String TEXT_280 = "(instanceValue);";
  protected final String TEXT_281 = NL + "\t\treturn ";
  protected final String TEXT_282 = ".convert";
  protected final String TEXT_283 = "(instanceValue);";
  protected final String TEXT_284 = NL + "\t\treturn ";
  protected final String TEXT_285 = ".convertToString(";
  protected final String TEXT_286 = ", instanceValue);";
  protected final String TEXT_287 = NL + "\t\tif (instanceValue == null) return null;" + NL + "\t\tif (instanceValue.isEmpty()) return \"\";" + NL + "\t\t";
  protected final String TEXT_288 = " result = new ";
  protected final String TEXT_289 = "();";
  protected final String TEXT_290 = NL + "\t\tfor (";
  protected final String TEXT_291 = " i = instanceValue.iterator(); i.hasNext(); )";
  protected final String TEXT_292 = NL + "\t\tfor (";
  protected final String TEXT_293 = " item : instanceValue)";
  protected final String TEXT_294 = NL + "\t\t{";
  protected final String TEXT_295 = NL + "\t\t\tresult.append(convert";
  protected final String TEXT_296 = "((";
  protected final String TEXT_297 = ")";
  protected final String TEXT_298 = "));";
  protected final String TEXT_299 = NL + "\t\t\tresult.append(convert";
  protected final String TEXT_300 = "ToString(";
  protected final String TEXT_301 = ", ";
  protected final String TEXT_302 = "));";
  protected final String TEXT_303 = NL + "\t\t\tresult.append(";
  protected final String TEXT_304 = ".convert";
  protected final String TEXT_305 = "((";
  protected final String TEXT_306 = ")";
  protected final String TEXT_307 = "));";
  protected final String TEXT_308 = NL + "\t\t\tresult.append(";
  protected final String TEXT_309 = ".convertToString(";
  protected final String TEXT_310 = ", ";
  protected final String TEXT_311 = "));";
  protected final String TEXT_312 = NL + "\t\t\tresult.append(' ');" + NL + "\t\t}" + NL + "\t\treturn result.substring(0, result.length() - 1);";
  protected final String TEXT_313 = NL + "\t\tif (instanceValue == null) return null;";
  protected final String TEXT_314 = NL + "\t\tif (";
  protected final String TEXT_315 = ".isInstance(instanceValue))" + NL + "\t\t{" + NL + "\t\t\ttry" + NL + "\t\t\t{";
  protected final String TEXT_316 = NL + "\t\t\t\tString value = convert";
  protected final String TEXT_317 = "(instanceValue);";
  protected final String TEXT_318 = NL + "\t\t\t\tString value = convert";
  protected final String TEXT_319 = "(((";
  protected final String TEXT_320 = ")instanceValue).";
  protected final String TEXT_321 = "());";
  protected final String TEXT_322 = NL + "\t\t\t\tString value = convert";
  protected final String TEXT_323 = "((";
  protected final String TEXT_324 = ")instanceValue);";
  protected final String TEXT_325 = NL + "\t\t\t\tString value = convert";
  protected final String TEXT_326 = "ToString(";
  protected final String TEXT_327 = ", instanceValue);";
  protected final String TEXT_328 = NL + "\t\t\t\tString value = ";
  protected final String TEXT_329 = ".convert";
  protected final String TEXT_330 = "((";
  protected final String TEXT_331 = ")instanceValue);";
  protected final String TEXT_332 = NL + "\t\t\t\tString value = ";
  protected final String TEXT_333 = ".convertToString(";
  protected final String TEXT_334 = ", instanceValue);";
  protected final String TEXT_335 = NL + "\t\t\t\tif (value != null) return value;" + NL + "\t\t\t}" + NL + "\t\t\tcatch (Exception e)" + NL + "\t\t\t{" + NL + "\t\t\t\t// Keep trying other member types until all have failed." + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_336 = NL + "\t\ttry" + NL + "\t\t{";
  protected final String TEXT_337 = NL + "\t\t\tString value = convert";
  protected final String TEXT_338 = "(instanceValue);";
  protected final String TEXT_339 = NL + "\t\t\tString value = convert";
  protected final String TEXT_340 = "ToString(";
  protected final String TEXT_341 = ", ";
  protected final String TEXT_342 = "new ";
  protected final String TEXT_343 = "(instanceValue)";
  protected final String TEXT_344 = "instanceValue";
  protected final String TEXT_345 = ");";
  protected final String TEXT_346 = NL + "\t\t\tString value = ";
  protected final String TEXT_347 = ".convert";
  protected final String TEXT_348 = "(instanceValue);";
  protected final String TEXT_349 = NL + "\t\t\tString value = ";
  protected final String TEXT_350 = ".convertToString(";
  protected final String TEXT_351 = ", ";
  protected final String TEXT_352 = "new ";
  protected final String TEXT_353 = "(instanceValue)";
  protected final String TEXT_354 = "instanceValue";
  protected final String TEXT_355 = ");";
  protected final String TEXT_356 = NL + "\t\t\tif (value != null) return value;" + NL + "\t\t}" + NL + "\t\tcatch (Exception e)" + NL + "\t\t{" + NL + "\t\t\t// Keep trying other member types until all have failed." + NL + "\t\t}";
  protected final String TEXT_357 = NL + "\t\tthrow new IllegalArgumentException(\"Invalid value: '\"+instanceValue+\"' for datatype :\"+";
  protected final String TEXT_358 = ".getName());";
  protected final String TEXT_359 = NL + "\t\treturn super.convertToString(instanceValue);";
  protected final String TEXT_360 = NL + "\t\t// TODO: implement this method" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new ";
  protected final String TEXT_361 = "();";
  protected final String TEXT_362 = NL + "\t\treturn super.convertToString(";
  protected final String TEXT_363 = ", new ";
  protected final String TEXT_364 = "(instanceValue));";
  protected final String TEXT_365 = NL + "\t\treturn super.convertToString(";
  protected final String TEXT_366 = ", instanceValue);";
  protected final String TEXT_367 = NL + "\t}" + NL;
  protected final String TEXT_368 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_369 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_370 = NL + "\tpublic String convert";
  protected final String TEXT_371 = "ToString(";
  protected final String TEXT_372 = " eDataType, Object instanceValue)" + NL + "\t{";
  protected final String TEXT_373 = NL + "\t\treturn convert";
  protected final String TEXT_374 = "((";
  protected final String TEXT_375 = ")instanceValue);";
  protected final String TEXT_376 = NL + "\t\treturn instanceValue == null ? null : instanceValue.toString();";
  protected final String TEXT_377 = NL + "\t\treturn convert";
  protected final String TEXT_378 = "ToString(";
  protected final String TEXT_379 = ", instanceValue);";
  protected final String TEXT_380 = NL + "\t\treturn ";
  protected final String TEXT_381 = ".convertToString(";
  protected final String TEXT_382 = ", instanceValue);";
  protected final String TEXT_383 = NL + "\t\treturn convert";
  protected final String TEXT_384 = "((";
  protected final String TEXT_385 = ")instanceValue);";
  protected final String TEXT_386 = NL + "\t\tif (instanceValue == null) return null;" + NL + "\t\t";
  protected final String TEXT_387 = " list = (";
  protected final String TEXT_388 = ")instanceValue;" + NL + "\t\tif (list.isEmpty()) return \"\";" + NL + "\t\t";
  protected final String TEXT_389 = " result = new ";
  protected final String TEXT_390 = "();";
  protected final String TEXT_391 = NL + "\t\tfor (";
  protected final String TEXT_392 = " i = list.iterator(); i.hasNext(); )";
  protected final String TEXT_393 = NL + "\t\tfor (";
  protected final String TEXT_394 = " item : list)";
  protected final String TEXT_395 = NL + "\t\t{";
  protected final String TEXT_396 = NL + "\t\t\tresult.append(convert";
  protected final String TEXT_397 = "ToString(";
  protected final String TEXT_398 = ", ";
  protected final String TEXT_399 = "));";
  protected final String TEXT_400 = NL + "\t\t\tresult.append(";
  protected final String TEXT_401 = ".convertToString(";
  protected final String TEXT_402 = ", ";
  protected final String TEXT_403 = "));";
  protected final String TEXT_404 = NL + "\t\t\tresult.append(' ');" + NL + "\t\t}" + NL + "\t\treturn result.substring(0, result.length() - 1);";
  protected final String TEXT_405 = NL + "\t\treturn instanceValue == null ? null : convert";
  protected final String TEXT_406 = "(((";
  protected final String TEXT_407 = ")instanceValue)";
  protected final String TEXT_408 = ".";
  protected final String TEXT_409 = "()";
  protected final String TEXT_410 = ");";
  protected final String TEXT_411 = NL + "\t\treturn convert";
  protected final String TEXT_412 = "(instanceValue);";
  protected final String TEXT_413 = NL + "\t\tif (instanceValue == null) return null;";
  protected final String TEXT_414 = NL + "\t\tif (";
  protected final String TEXT_415 = ".isInstance(instanceValue))" + NL + "\t\t{" + NL + "\t\t\ttry" + NL + "\t\t\t{";
  protected final String TEXT_416 = NL + "\t\t\t\tString value = convert";
  protected final String TEXT_417 = "ToString(";
  protected final String TEXT_418 = ", instanceValue);";
  protected final String TEXT_419 = NL + "\t\t\t\tString value = ";
  protected final String TEXT_420 = ".convertToString(";
  protected final String TEXT_421 = ", instanceValue);";
  protected final String TEXT_422 = NL + "\t\t\t\tif (value != null) return value;" + NL + "\t\t\t}" + NL + "\t\t\tcatch (Exception e)" + NL + "\t\t\t{" + NL + "\t\t\t\t// Keep trying other member types until all have failed." + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_423 = NL + "\t\tthrow new IllegalArgumentException(\"Invalid value: '\"+instanceValue+\"' for datatype :\"+eDataType.getName());";
  protected final String TEXT_424 = NL + "\t\treturn instanceValue == null ? null : convert";
  protected final String TEXT_425 = "(";
  protected final String TEXT_426 = "(";
  protected final String TEXT_427 = "(";
  protected final String TEXT_428 = ")instanceValue";
  protected final String TEXT_429 = ").";
  protected final String TEXT_430 = "()";
  protected final String TEXT_431 = ");";
  protected final String TEXT_432 = NL + "\t\treturn convert";
  protected final String TEXT_433 = "((";
  protected final String TEXT_434 = ")instanceValue);";
  protected final String TEXT_435 = NL + "\t\treturn super.convertToString(instanceValue);";
  protected final String TEXT_436 = NL + "\t\t// TODO: implement this method" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new ";
  protected final String TEXT_437 = "();";
  protected final String TEXT_438 = NL + "\t\treturn super.convertToString(eDataType, instanceValue);";
  protected final String TEXT_439 = NL + "\t}" + NL;
  protected final String TEXT_440 = NL + "\t/**" + NL + "\t * Returns a new object of class '<em>";
  protected final String TEXT_441 = "</em>'." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @return a new object of class '<em>";
  protected final String TEXT_442 = "</em>'." + NL + "\t * @generated" + NL + "\t */" + NL + "\t";
  protected final String TEXT_443 = " create";
  protected final String TEXT_444 = "();" + NL;
  protected final String TEXT_445 = NL + "\t/**" + NL + "\t * Returns an instance of data type '<em>";
  protected final String TEXT_446 = "</em>' corresponding the given literal." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @param literal a literal of the data type." + NL + "\t * @return a new instance value of the data type." + NL + "\t * @generated" + NL + "\t */" + NL + "\t";
  protected final String TEXT_447 = " create";
  protected final String TEXT_448 = "(String literal);" + NL + "" + NL + "\t/**" + NL + "\t * Returns a literal representation of an instance of data type '<em>";
  protected final String TEXT_449 = "</em>'." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @param instanceValue an instance value of the data type." + NL + "\t * @return a literal representation of the instance value." + NL + "\t * @generated" + NL + "\t */" + NL + "\tString convert";
  protected final String TEXT_450 = "(";
  protected final String TEXT_451 = " instanceValue);" + NL;
  protected final String TEXT_452 = NL + "\t/**" + NL + "\t * Returns the package supported by this factory." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @return the package supported by this factory." + NL + "\t * @generated" + NL + "\t */" + NL + "\t";
  protected final String TEXT_453 = " get";
  protected final String TEXT_454 = "();" + NL;
  protected final String TEXT_455 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_456 = " get";
  protected final String TEXT_457 = "()" + NL + "\t{" + NL + "\t\treturn (";
  protected final String TEXT_458 = ")getEPackage();" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @deprecated" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_459 = NL + "\t@Deprecated";
  protected final String TEXT_460 = NL + "\tpublic static ";
  protected final String TEXT_461 = " getPackage()" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_462 = ".eINSTANCE;" + NL + "\t}" + NL;
  protected final String TEXT_463 = NL + "} //";
  protected final String TEXT_464 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
/**
 * Copyright (c) 2002-2010 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 */

    GenPackage genPackage = (GenPackage)((Object[])argument)[0]; GenModel genModel=genPackage.getGenModel(); /* Trick to import java.util.* without warnings */Iterator.class.getName();
    boolean isInterface = Boolean.TRUE.equals(((Object[])argument)[1]); boolean isImplementation = Boolean.TRUE.equals(((Object[])argument)[2]);
    String publicStaticFinalFlag = isImplementation ? "public static final " : "";
    stringBuffer.append(TEXT_1);
    stringBuffer.append(TEXT_2);
    if (isInterface || genModel.isSuppressInterfaces()) {
    stringBuffer.append(TEXT_3);
    stringBuffer.append(genPackage.getReflectionPackageName());
    stringBuffer.append(TEXT_4);
    } else {
    stringBuffer.append(TEXT_5);
    stringBuffer.append(genPackage.getClassPackageName());
    stringBuffer.append(TEXT_6);
    }
    stringBuffer.append(TEXT_7);
    if (isImplementation) {
    genModel.addPseudoImport("org.eclipse.emf.ecore.impl.MinimalEObjectImpl.Container");
    genModel.addPseudoImport("org.eclipse.emf.ecore.impl.MinimalEObjectImpl.Container.Dynamic");
    genModel.addImport("org.eclipse.emf.ecore.EClass");
    genModel.addImport("org.eclipse.emf.ecore.EObject");
    if (!genPackage.hasJavaLangConflict() && !genPackage.hasInterfaceImplConflict() && !genPackage.getClassPackageName().equals(genPackage.getInterfacePackageName())) genModel.addImport(genPackage.getInterfacePackageName() + ".*");
    }
    genModel.markImportLocation(stringBuffer);
    stringBuffer.append(TEXT_8);
    if (isInterface) {
    stringBuffer.append(TEXT_9);
    if (!genModel.isSuppressEMFMetaData()) {
    stringBuffer.append(TEXT_10);
    stringBuffer.append(genPackage.getQualifiedPackageInterfaceName());
    }
    stringBuffer.append(TEXT_11);
    } else {
    stringBuffer.append(TEXT_12);
    }
    if (isImplementation) {
    stringBuffer.append(TEXT_13);
    stringBuffer.append(genPackage.getFactoryClassName());
    stringBuffer.append(TEXT_14);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.EFactoryImpl"));
    if (!genModel.isSuppressInterfaces()) {
    stringBuffer.append(TEXT_15);
    stringBuffer.append(genPackage.getImportedFactoryInterfaceName());
    }
    } else {
    stringBuffer.append(TEXT_16);
    stringBuffer.append(genPackage.getFactoryInterfaceName());
    if (!genModel.isSuppressEMFMetaData()) {
    stringBuffer.append(TEXT_17);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EFactory"));
    }
    }
    stringBuffer.append(TEXT_18);
    if (genModel.hasCopyrightField()) {
    stringBuffer.append(TEXT_19);
    stringBuffer.append(publicStaticFinalFlag);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_20);
    stringBuffer.append(genModel.getCopyrightFieldLiteral());
    stringBuffer.append(TEXT_21);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_22);
    }
    if (isImplementation && (genModel.isSuppressEMFMetaData() || genModel.isSuppressInterfaces())) {
    stringBuffer.append(TEXT_23);
    stringBuffer.append(publicStaticFinalFlag);
    stringBuffer.append(genPackage.getFactoryClassName());
    stringBuffer.append(TEXT_24);
    }
    if (isInterface && genModel.isSuppressEMFMetaData()) {
    stringBuffer.append(TEXT_25);
    stringBuffer.append(publicStaticFinalFlag);
    stringBuffer.append(genPackage.getFactoryInterfaceName());
    stringBuffer.append(TEXT_26);
    stringBuffer.append(genPackage.getQualifiedFactoryClassName());
    stringBuffer.append(TEXT_27);
    } else if (isInterface && !genModel.isSuppressInterfaces()) {
    stringBuffer.append(TEXT_28);
    stringBuffer.append(publicStaticFinalFlag);
    stringBuffer.append(genPackage.getFactoryInterfaceName());
    stringBuffer.append(TEXT_29);
    stringBuffer.append(genPackage.getQualifiedFactoryClassName());
    stringBuffer.append(TEXT_30);
    }
    if (isImplementation) {
    stringBuffer.append(TEXT_31);
    String factoryType = genModel.isSuppressEMFMetaData() ? genPackage.getFactoryClassName() : genPackage.getImportedFactoryInterfaceName();
    stringBuffer.append(TEXT_32);
    stringBuffer.append(factoryType);
    stringBuffer.append(TEXT_33);
    stringBuffer.append(factoryType);
    stringBuffer.append(TEXT_34);
    stringBuffer.append(genPackage.getFactoryName());
    stringBuffer.append(TEXT_35);
    stringBuffer.append(factoryType);
    stringBuffer.append(TEXT_36);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EPackage"));
    stringBuffer.append(TEXT_37);
    stringBuffer.append(genPackage.getNSURI());
    stringBuffer.append(TEXT_38);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_39);
    stringBuffer.append(genPackage.getFactoryName());
    stringBuffer.append(TEXT_40);
    stringBuffer.append(genPackage.getFactoryName());
    stringBuffer.append(TEXT_41);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.plugin.EcorePlugin"));
    stringBuffer.append(TEXT_42);
    stringBuffer.append(genPackage.getImportedFactoryClassName());
    stringBuffer.append(TEXT_43);
    stringBuffer.append(genPackage.getFactoryClassName());
    stringBuffer.append(TEXT_44);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_45);
    }
    stringBuffer.append(TEXT_46);
    for (GenClass genClass : genPackage.getGenClasses()) {
    if (!genClass.isAbstract()) {
    stringBuffer.append(TEXT_47);
    stringBuffer.append(genPackage.getImportedPackageInterfaceName());
    stringBuffer.append(TEXT_48);
    stringBuffer.append(genClass.getClassifierID());
    stringBuffer.append(TEXT_49);
    stringBuffer.append(!genClass.isEObjectExtension() ? "(EObject)" : "" );
    stringBuffer.append(TEXT_50);
    stringBuffer.append(genClass.getName());
    stringBuffer.append(TEXT_51);
    }
    }
    stringBuffer.append(TEXT_52);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(genModel.getNonNLS(2));
    stringBuffer.append(TEXT_53);
    if (!genPackage.getAllGenDataTypes().isEmpty()) {
    stringBuffer.append(TEXT_54);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_55);
    }
    stringBuffer.append(TEXT_56);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EDataType"));
    stringBuffer.append(TEXT_57);
    for (GenDataType genDataType : genPackage.getAllGenDataTypes()) {
    if (genDataType.isSerializable()) {
    stringBuffer.append(TEXT_58);
    stringBuffer.append(genPackage.getImportedPackageInterfaceName());
    stringBuffer.append(TEXT_59);
    stringBuffer.append(genDataType.getClassifierID());
    stringBuffer.append(TEXT_60);
    stringBuffer.append(genDataType.getName());
    stringBuffer.append(TEXT_61);
    }
    }
    stringBuffer.append(TEXT_62);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(genModel.getNonNLS(2));
    stringBuffer.append(TEXT_63);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_64);
    }
    stringBuffer.append(TEXT_65);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EDataType"));
    stringBuffer.append(TEXT_66);
    for (GenDataType genDataType : genPackage.getAllGenDataTypes()) {
    if (genDataType.isSerializable()) {
    stringBuffer.append(TEXT_67);
    stringBuffer.append(genPackage.getImportedPackageInterfaceName());
    stringBuffer.append(TEXT_68);
    stringBuffer.append(genDataType.getClassifierID());
    stringBuffer.append(TEXT_69);
    stringBuffer.append(genDataType.getName());
    stringBuffer.append(TEXT_70);
    }
    }
    stringBuffer.append(TEXT_71);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(genModel.getNonNLS(2));
    stringBuffer.append(TEXT_72);
    }
    for (GenClass genClass : genPackage.getGenClasses()) {
    if (!genClass.isAbstract()) {
    stringBuffer.append(TEXT_73);
    stringBuffer.append(genClass.getTypeParameters());
    stringBuffer.append(genClass.getImportedInterfaceName());
    stringBuffer.append(genClass.getInterfaceTypeArguments());
    stringBuffer.append(TEXT_74);
    stringBuffer.append(genClass.getName());
    stringBuffer.append(TEXT_75);
    if (genClass.isDynamic()) {
    stringBuffer.append(TEXT_76);
    stringBuffer.append(genClass.getImportedInterfaceName());
    stringBuffer.append(genClass.getInterfaceTypeArguments());
    stringBuffer.append(TEXT_77);
    stringBuffer.append(genClass.getSafeUncapName());
    stringBuffer.append(TEXT_78);
    stringBuffer.append(genClass.getCastFromEObject());
    stringBuffer.append(TEXT_79);
    stringBuffer.append(genClass.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_80);
    } else {
    stringBuffer.append(TEXT_81);
    stringBuffer.append(genClass.getImportedClassName());
    stringBuffer.append(genClass.getClassTypeArguments());
    stringBuffer.append(TEXT_82);
    stringBuffer.append(genClass.getSafeUncapName());
    stringBuffer.append(TEXT_83);
    stringBuffer.append(genClass.getImportedClassName());
    stringBuffer.append(genClass.getClassTypeArguments());
    stringBuffer.append(TEXT_84);
    if (genModel.isSuppressInterfaces() && !genPackage.getReflectionPackageName().equals(genPackage.getInterfacePackageName())) {
    stringBuffer.append(TEXT_85);
    }
    stringBuffer.append(TEXT_86);
    }
    stringBuffer.append(TEXT_87);
    stringBuffer.append(genClass.getSafeUncapName());
    stringBuffer.append(TEXT_88);
    }
    }
    for (GenDataType genDataType : genPackage.getAllGenDataTypes()) {
    if (genDataType.isSerializable()) {
    if (genPackage.isDataTypeConverters() || genDataType.hasCreatorBody()) { String eDataType = genDataType.getQualifiedClassifierAccessor();
    stringBuffer.append(TEXT_89);
    if (genModel.useGenerics() && genDataType.isUncheckedCast() && !genDataType.hasCreatorBody()) {
    stringBuffer.append(TEXT_90);
    }
    stringBuffer.append(TEXT_91);
    stringBuffer.append(genDataType.getImportedParameterizedInstanceClassName());
    stringBuffer.append(TEXT_92);
    stringBuffer.append(genDataType.getName());
    stringBuffer.append(TEXT_93);
    if (genDataType.hasCreatorBody()) {
    stringBuffer.append(TEXT_94);
    } else {
    stringBuffer.append(TEXT_95);
    }
    stringBuffer.append(TEXT_96);
    if (genDataType.hasCreatorBody()) {
    stringBuffer.append(TEXT_97);
    stringBuffer.append(genDataType.getCreatorBody(genModel.getIndentation(stringBuffer)));
    } else if (genDataType instanceof GenEnum) {
    stringBuffer.append(TEXT_98);
    stringBuffer.append(genDataType.getImportedInstanceClassName());
    stringBuffer.append(TEXT_99);
    stringBuffer.append(genDataType.getImportedInstanceClassName());
    stringBuffer.append(TEXT_100);
    stringBuffer.append(eDataType);
    stringBuffer.append(TEXT_101);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(genModel.getNonNLS(2));
    stringBuffer.append(genModel.getNonNLS(3));
    stringBuffer.append(TEXT_102);
    } else if (genDataType.getBaseType() != null) { GenDataType genBaseType = genDataType.getBaseType(); boolean isPrimitiveConversion = !genDataType.isPrimitiveType() && genBaseType.isPrimitiveType();
    if (genBaseType.getGenPackage() == genPackage) {
    if (isPrimitiveConversion && genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_103);
    stringBuffer.append(genDataType.getObjectInstanceClassName());
    stringBuffer.append(TEXT_104);
    stringBuffer.append(genBaseType.getName());
    stringBuffer.append(TEXT_105);
    } else {
    stringBuffer.append(TEXT_106);
    stringBuffer.append(genBaseType.getName());
    stringBuffer.append(TEXT_107);
    }
    } else if (genBaseType.getGenPackage().isDataTypeConverters()) {
    if (isPrimitiveConversion && genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_108);
    stringBuffer.append(genDataType.getObjectInstanceClassName());
    stringBuffer.append(TEXT_109);
    stringBuffer.append(genBaseType.getGenPackage().getQualifiedEFactoryInternalInstanceAccessor());
    stringBuffer.append(TEXT_110);
    stringBuffer.append(genBaseType.getName());
    stringBuffer.append(TEXT_111);
    } else {
    stringBuffer.append(TEXT_112);
    stringBuffer.append(genBaseType.getGenPackage().getQualifiedEFactoryInternalInstanceAccessor());
    stringBuffer.append(TEXT_113);
    stringBuffer.append(genBaseType.getName());
    stringBuffer.append(TEXT_114);
    }
    } else {
    stringBuffer.append(TEXT_115);
    if (!genDataType.isObjectType()) {
    stringBuffer.append(TEXT_116);
    stringBuffer.append(genDataType.getObjectInstanceClassName());
    stringBuffer.append(TEXT_117);
    }
    stringBuffer.append(genBaseType.getGenPackage().getQualifiedEFactoryInternalInstanceAccessor());
    stringBuffer.append(TEXT_118);
    stringBuffer.append(genBaseType.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_119);
    }
    } else if (genDataType.getItemType() != null) { GenDataType genItemType = genDataType.getItemType(); 
    stringBuffer.append(TEXT_120);
    stringBuffer.append(genDataType.getImportedParameterizedInstanceClassName());
    stringBuffer.append(TEXT_121);
    stringBuffer.append(genModel.getImportedName("java.util.ArrayList"));
    if (genModel.useGenerics()) {
    stringBuffer.append(TEXT_122);
    stringBuffer.append(genItemType.getObjectType().getImportedParameterizedInstanceClassName());
    stringBuffer.append(TEXT_123);
    }
    stringBuffer.append(TEXT_124);
    if (genModel.getRuntimeVersion().getValue() < GenRuntimeVersion.EMF26_VALUE) {
    stringBuffer.append(TEXT_125);
    stringBuffer.append(genModel.getImportedName("java.util.StringTokenizer"));
    stringBuffer.append(TEXT_126);
    stringBuffer.append(genModel.getImportedName("java.util.StringTokenizer"));
    stringBuffer.append(TEXT_127);
    } else {
    stringBuffer.append(TEXT_128);
    }
    stringBuffer.append(TEXT_129);
    if (genModel.getRuntimeVersion().getValue() < GenRuntimeVersion.EMF26_VALUE) {
    stringBuffer.append(TEXT_130);
    }
    if (genItemType.getGenPackage() == genPackage) {
    if (genPackage.isDataTypeConverters()) { genItemType = genItemType.getObjectType();
    stringBuffer.append(TEXT_131);
    stringBuffer.append(genItemType.getName());
    stringBuffer.append(TEXT_132);
    } else {
    stringBuffer.append(TEXT_133);
    stringBuffer.append(genItemType.getName());
    stringBuffer.append(TEXT_134);
    stringBuffer.append(genItemType.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_135);
    }
    } else {
    if (genItemType.getGenPackage().isDataTypeConverters()) { genItemType = genItemType.getObjectType();
    stringBuffer.append(TEXT_136);
    stringBuffer.append(genItemType.getGenPackage().getQualifiedEFactoryInternalInstanceAccessor());
    stringBuffer.append(TEXT_137);
    stringBuffer.append(genItemType.getName());
    stringBuffer.append(TEXT_138);
    } else {
    stringBuffer.append(TEXT_139);
    stringBuffer.append(genItemType.getGenPackage().getQualifiedEFactoryInternalInstanceAccessor());
    stringBuffer.append(TEXT_140);
    stringBuffer.append(genItemType.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_141);
    }
    }
    stringBuffer.append(TEXT_142);
    } else if (!genDataType.getMemberTypes().isEmpty()) {
    stringBuffer.append(TEXT_143);
    stringBuffer.append(genDataType.getStaticValue(null));
    stringBuffer.append(TEXT_144);
    stringBuffer.append(genDataType.getImportedInstanceClassName());
    stringBuffer.append(TEXT_145);
    stringBuffer.append(genDataType.getStaticValue(null));
    stringBuffer.append(TEXT_146);
    for (GenDataType genMemberType : genDataType.getMemberTypes()) {
    stringBuffer.append(TEXT_147);
    if (genMemberType.getGenPackage() == genPackage) {
    if (genPackage.isDataTypeConverters()) { if (!genDataType.isPrimitiveType()) genMemberType = genMemberType.getObjectType();
    stringBuffer.append(TEXT_148);
    stringBuffer.append(genMemberType.getName());
    stringBuffer.append(TEXT_149);
    } else {
    stringBuffer.append(TEXT_150);
    stringBuffer.append(genDataType.getObjectInstanceClassName());
    stringBuffer.append(TEXT_151);
    stringBuffer.append(genMemberType.getName());
    stringBuffer.append(TEXT_152);
    stringBuffer.append(genMemberType.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_153);
    }
    } else {
    if (genPackage.isDataTypeConverters()) { if (!genDataType.isPrimitiveType()) genMemberType = genMemberType.getObjectType();
    stringBuffer.append(TEXT_154);
    stringBuffer.append(genMemberType.getGenPackage().getQualifiedEFactoryInternalInstanceAccessor());
    stringBuffer.append(TEXT_155);
    stringBuffer.append(genMemberType.getName());
    stringBuffer.append(TEXT_156);
    } else {
    stringBuffer.append(TEXT_157);
    stringBuffer.append(genDataType.getObjectInstanceClassName());
    stringBuffer.append(TEXT_158);
    stringBuffer.append(genMemberType.getGenPackage().getQualifiedEFactoryInternalInstanceAccessor());
    stringBuffer.append(TEXT_159);
    stringBuffer.append(genMemberType.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_160);
    }
    }
    stringBuffer.append(TEXT_161);
    if (!genDataType.isPrimitiveType()) {
    stringBuffer.append(TEXT_162);
    }
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.Diagnostician"));
    stringBuffer.append(TEXT_163);
    stringBuffer.append(eDataType);
    stringBuffer.append(TEXT_164);
    if (genDataType.isPrimitiveType() && genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_165);
    stringBuffer.append(genDataType.getObjectInstanceClassName());
    stringBuffer.append(TEXT_166);
    } else {
    stringBuffer.append(TEXT_167);
    }
    stringBuffer.append(TEXT_168);
    }
    stringBuffer.append(TEXT_169);
    if (!genDataType.isPrimitiveType()) {
    stringBuffer.append(TEXT_170);
    }
    stringBuffer.append(TEXT_171);
    } else if (genModel.useGenerics() && (genDataType.isArrayType() || !genDataType.getEcoreDataType().getETypeParameters().isEmpty() || genDataType.getEcoreDataType().getInstanceTypeName().contains("<"))) {
    stringBuffer.append(TEXT_172);
    stringBuffer.append(genDataType.getImportedParameterizedObjectInstanceClassName());
    stringBuffer.append(TEXT_173);
    } else if (genDataType.isArrayType()) {
    stringBuffer.append(TEXT_174);
    stringBuffer.append(genModel.getImportedName("java.lang.UnsupportedOperationException"));
    stringBuffer.append(TEXT_175);
    } else if (genDataType.isPrimitiveType() && genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_176);
    stringBuffer.append(genDataType.getObjectInstanceClassName());
    stringBuffer.append(TEXT_177);
    stringBuffer.append(eDataType);
    stringBuffer.append(TEXT_178);
    stringBuffer.append(genDataType.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_179);
    } else {
    stringBuffer.append(TEXT_180);
    if (!genDataType.isObjectType()) {
    stringBuffer.append(TEXT_181);
    stringBuffer.append(genDataType.getObjectInstanceClassName());
    stringBuffer.append(TEXT_182);
    }
    stringBuffer.append(TEXT_183);
    stringBuffer.append(eDataType);
    stringBuffer.append(TEXT_184);
    }
    stringBuffer.append(TEXT_185);
    }
    stringBuffer.append(TEXT_186);
    if (!genPackage.isDataTypeConverters() && genModel.useGenerics() && genDataType.isUncheckedCast() && !genDataType.hasCreatorBody()) {
    stringBuffer.append(TEXT_187);
    }
    stringBuffer.append(TEXT_188);
    stringBuffer.append(genDataType.getImportedParameterizedObjectInstanceClassName());
    stringBuffer.append(TEXT_189);
    stringBuffer.append(genDataType.getName());
    stringBuffer.append(TEXT_190);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EDataType"));
    stringBuffer.append(TEXT_191);
    if (genDataType instanceof GenEnum) {
    if (genPackage.isDataTypeConverters() || genDataType.hasCreatorBody()) {
    stringBuffer.append(TEXT_192);
    stringBuffer.append(genDataType.getName());
    stringBuffer.append(TEXT_193);
    } else {
    stringBuffer.append(TEXT_194);
    stringBuffer.append(((GenEnum)genDataType).getImportedInstanceClassName());
    stringBuffer.append(TEXT_195);
    stringBuffer.append(((GenEnum)genDataType).getImportedInstanceClassName());
    stringBuffer.append(TEXT_196);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(genModel.getNonNLS(2));
    stringBuffer.append(genModel.getNonNLS(3));
    stringBuffer.append(TEXT_197);
    }
    } else if (genDataType.getBaseType() != null) { GenDataType genBaseType = genDataType.getBaseType(); 
    if (genBaseType.getGenPackage() == genPackage) {
    stringBuffer.append(TEXT_198);
    if (!genDataType.getObjectInstanceClassName().equals(genBaseType.getObjectInstanceClassName())) {
    stringBuffer.append(TEXT_199);
    stringBuffer.append(genDataType.getObjectInstanceClassName());
    stringBuffer.append(TEXT_200);
    }
    stringBuffer.append(TEXT_201);
    stringBuffer.append(genBaseType.getName());
    stringBuffer.append(TEXT_202);
    stringBuffer.append(genBaseType.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_203);
    } else {
    stringBuffer.append(TEXT_204);
    if (!genDataType.isObjectType()) {
    stringBuffer.append(TEXT_205);
    stringBuffer.append(genDataType.getObjectInstanceClassName());
    stringBuffer.append(TEXT_206);
    }
    stringBuffer.append(genBaseType.getGenPackage().getQualifiedEFactoryInternalInstanceAccessor());
    stringBuffer.append(TEXT_207);
    stringBuffer.append(genBaseType.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_208);
    }
    } else if (genDataType.getItemType() != null) { GenDataType genItemType = genDataType.getItemType(); 
    if (genPackage.isDataTypeConverters()) {
    stringBuffer.append(TEXT_209);
    stringBuffer.append(genDataType.getName());
    stringBuffer.append(TEXT_210);
    } else {
    stringBuffer.append(TEXT_211);
    stringBuffer.append(genDataType.getImportedParameterizedObjectInstanceClassName());
    stringBuffer.append(TEXT_212);
    stringBuffer.append(genModel.getImportedName("java.util.ArrayList"));
    if (genModel.useGenerics()) {
    stringBuffer.append(TEXT_213);
    stringBuffer.append(genItemType.getObjectType().getImportedParameterizedInstanceClassName());
    stringBuffer.append(TEXT_214);
    }
    stringBuffer.append(TEXT_215);
    if (genModel.getRuntimeVersion().getValue() < GenRuntimeVersion.EMF26_VALUE) {
    stringBuffer.append(TEXT_216);
    stringBuffer.append(genModel.getImportedName("java.util.StringTokenizer"));
    stringBuffer.append(TEXT_217);
    stringBuffer.append(genModel.getImportedName("java.util.StringTokenizer"));
    stringBuffer.append(TEXT_218);
    } else {
    stringBuffer.append(TEXT_219);
    }
    stringBuffer.append(TEXT_220);
    if (genModel.getRuntimeVersion().getValue() < GenRuntimeVersion.EMF26_VALUE) {
    stringBuffer.append(TEXT_221);
    }
    if (genItemType.getGenPackage() == genPackage) {
    stringBuffer.append(TEXT_222);
    stringBuffer.append(genItemType.getName());
    stringBuffer.append(TEXT_223);
    stringBuffer.append(genItemType.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_224);
    } else {
    stringBuffer.append(TEXT_225);
    if (!genItemType.isObjectType()) {
    stringBuffer.append(TEXT_226);
    stringBuffer.append(genItemType.getObjectInstanceClassName());
    stringBuffer.append(TEXT_227);
    }
    stringBuffer.append(genItemType.getGenPackage().getQualifiedEFactoryInternalInstanceAccessor());
    stringBuffer.append(TEXT_228);
    stringBuffer.append(genItemType.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_229);
    }
    stringBuffer.append(TEXT_230);
    }
    } else if (!genDataType.getMemberTypes().isEmpty()) {
    if (genPackage.isDataTypeConverters()) {
    if (genDataType.isPrimitiveType() && genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_231);
    stringBuffer.append(genDataType.getObjectInstanceClassName());
    stringBuffer.append(TEXT_232);
    stringBuffer.append(genDataType.getName());
    stringBuffer.append(TEXT_233);
    } else {
    stringBuffer.append(TEXT_234);
    stringBuffer.append(genDataType.getName());
    stringBuffer.append(TEXT_235);
    }
    } else {
    stringBuffer.append(TEXT_236);
    stringBuffer.append(genDataType.getObjectInstanceClassName());
    stringBuffer.append(TEXT_237);
    for (GenDataType genMemberType : genDataType.getMemberTypes()) {
    stringBuffer.append(TEXT_238);
    if (genMemberType.getGenPackage() == genPackage) {
    stringBuffer.append(TEXT_239);
    if (!genDataType.isObjectType() && !genDataType.getObjectInstanceClassName().equals(genMemberType.getObjectInstanceClassName())) {
    stringBuffer.append(TEXT_240);
    stringBuffer.append(genDataType.getObjectInstanceClassName());
    stringBuffer.append(TEXT_241);
    }
    stringBuffer.append(TEXT_242);
    stringBuffer.append(genMemberType.getName());
    stringBuffer.append(TEXT_243);
    stringBuffer.append(genMemberType.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_244);
    } else {
    stringBuffer.append(TEXT_245);
    if (!genDataType.isObjectType()) {
    stringBuffer.append(TEXT_246);
    stringBuffer.append(genDataType.getObjectInstanceClassName());
    stringBuffer.append(TEXT_247);
    }
    stringBuffer.append(genMemberType.getGenPackage().getQualifiedEFactoryInternalInstanceAccessor());
    stringBuffer.append(TEXT_248);
    stringBuffer.append(genMemberType.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_249);
    }
    stringBuffer.append(TEXT_250);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.Diagnostician"));
    stringBuffer.append(TEXT_251);
    }
    stringBuffer.append(TEXT_252);
    }
    } else if (genPackage.isDataTypeConverters() || genDataType.hasCreatorBody()) {
    stringBuffer.append(TEXT_253);
    stringBuffer.append(genDataType.getName());
    stringBuffer.append(TEXT_254);
    } else if (genModel.useGenerics() && (genDataType.isArrayType() || !genDataType.getEcoreDataType().getETypeParameters().isEmpty() || genDataType.getEcoreDataType().getInstanceTypeName().contains("<"))) {
    stringBuffer.append(TEXT_255);
    if (!genDataType.isObjectType()) {
    stringBuffer.append(TEXT_256);
    stringBuffer.append(genDataType.getImportedParameterizedObjectInstanceClassName());
    stringBuffer.append(TEXT_257);
    }
    stringBuffer.append(TEXT_258);
    } else if (genDataType.isArrayType()) {
    stringBuffer.append(TEXT_259);
    stringBuffer.append(genModel.getImportedName("java.lang.UnsupportedOperationException"));
    stringBuffer.append(TEXT_260);
    } else {
    stringBuffer.append(TEXT_261);
    if (!genDataType.isObjectType()) {
    stringBuffer.append(TEXT_262);
    stringBuffer.append(genDataType.getObjectInstanceClassName());
    stringBuffer.append(TEXT_263);
    }
    stringBuffer.append(TEXT_264);
    }
    stringBuffer.append(TEXT_265);
    if (genPackage.isDataTypeConverters() || genDataType.hasConverterBody()) { String eDataType = genDataType.getQualifiedClassifierAccessor();
    stringBuffer.append(TEXT_266);
    stringBuffer.append(genDataType.getName());
    stringBuffer.append(TEXT_267);
    stringBuffer.append(genDataType.getImportedBoundedWildcardInstanceClassName());
    stringBuffer.append(TEXT_268);
    if (genDataType.hasConverterBody()) {
    stringBuffer.append(TEXT_269);
    } else {
    stringBuffer.append(TEXT_270);
    }
    stringBuffer.append(TEXT_271);
    if (genDataType.hasConverterBody()) {
    stringBuffer.append(TEXT_272);
    stringBuffer.append(genDataType.getConverterBody(genModel.getIndentation(stringBuffer)));
    } else if (genDataType instanceof GenEnum) {
    stringBuffer.append(TEXT_273);
    } else if (genDataType.getBaseType() != null) { GenDataType genBaseType = genDataType.getBaseType(); boolean isPrimitiveConversion = !genDataType.isPrimitiveType() && genBaseType.isPrimitiveType();
    if (genBaseType.getGenPackage() == genPackage) {
    if (isPrimitiveConversion) {
    stringBuffer.append(TEXT_274);
    stringBuffer.append(genBaseType.getName());
    stringBuffer.append(TEXT_275);
    if (genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_276);
    stringBuffer.append(genBaseType.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_277);
    }
    stringBuffer.append(TEXT_278);
    } else {
    stringBuffer.append(TEXT_279);
    stringBuffer.append(genBaseType.getName());
    stringBuffer.append(TEXT_280);
    }
    } else if (genBaseType.getGenPackage().isDataTypeConverters()) {
    stringBuffer.append(TEXT_281);
    stringBuffer.append(genBaseType.getGenPackage().getQualifiedFactoryInstanceAccessor());
    stringBuffer.append(TEXT_282);
    stringBuffer.append(genBaseType.getName());
    stringBuffer.append(TEXT_283);
    } else {
    stringBuffer.append(TEXT_284);
    stringBuffer.append(genBaseType.getGenPackage().getQualifiedEFactoryInternalInstanceAccessor());
    stringBuffer.append(TEXT_285);
    stringBuffer.append(genBaseType.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_286);
    }
    } else if (genDataType.getItemType() != null) { GenDataType genItemType = genDataType.getItemType(); 
    stringBuffer.append(TEXT_287);
    stringBuffer.append(genModel.getImportedName("java.lang.StringBuffer"));
    stringBuffer.append(TEXT_288);
    stringBuffer.append(genModel.getImportedName("java.lang.StringBuffer"));
    stringBuffer.append(TEXT_289);
    String item; if (!genModel.useGenerics()) { item = "i.next()"; 
    stringBuffer.append(TEXT_290);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    stringBuffer.append(TEXT_291);
    } else { item = "item";
    stringBuffer.append(TEXT_292);
    stringBuffer.append(genModel.getImportedName("java.lang.Object"));
    stringBuffer.append(TEXT_293);
    }
    stringBuffer.append(TEXT_294);
    if (genItemType.getGenPackage() == genPackage) {
    if (genPackage.isDataTypeConverters()) { genItemType = genItemType.getObjectType();
    stringBuffer.append(TEXT_295);
    stringBuffer.append(genItemType.getName());
    stringBuffer.append(TEXT_296);
    stringBuffer.append(genItemType.getObjectInstanceClassName());
    stringBuffer.append(TEXT_297);
    stringBuffer.append(item);
    stringBuffer.append(TEXT_298);
    } else {
    stringBuffer.append(TEXT_299);
    stringBuffer.append(genItemType.getName());
    stringBuffer.append(TEXT_300);
    stringBuffer.append(genItemType.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_301);
    stringBuffer.append(item);
    stringBuffer.append(TEXT_302);
    }
    } else {
    if (genItemType.getGenPackage().isDataTypeConverters()) { genItemType = genItemType.getObjectType();
    stringBuffer.append(TEXT_303);
    stringBuffer.append(genItemType.getGenPackage().getQualifiedEFactoryInternalInstanceAccessor());
    stringBuffer.append(TEXT_304);
    stringBuffer.append(genItemType.getName());
    stringBuffer.append(TEXT_305);
    stringBuffer.append(genItemType.getObjectInstanceClassName());
    stringBuffer.append(TEXT_306);
    stringBuffer.append(item);
    stringBuffer.append(TEXT_307);
    } else {
    stringBuffer.append(TEXT_308);
    stringBuffer.append(genItemType.getGenPackage().getQualifiedEFactoryInternalInstanceAccessor());
    stringBuffer.append(TEXT_309);
    stringBuffer.append(genItemType.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_310);
    stringBuffer.append(item);
    stringBuffer.append(TEXT_311);
    }
    }
    stringBuffer.append(TEXT_312);
    } else if (!genDataType.getMemberTypes().isEmpty()) {
    if (!genDataType.isPrimitiveType()) {
    stringBuffer.append(TEXT_313);
    for (GenDataType genMemberType : genDataType.getMemberTypes()) {
    stringBuffer.append(TEXT_314);
    stringBuffer.append(genMemberType.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_315);
    if (genMemberType.getGenPackage() == genPackage) {
    if (genPackage.isDataTypeConverters()) {
    if (genMemberType.getQualifiedInstanceClassName().equals(genDataType.getQualifiedInstanceClassName())) {
    stringBuffer.append(TEXT_316);
    stringBuffer.append(genMemberType.getName());
    stringBuffer.append(TEXT_317);
    } else if (genMemberType.isPrimitiveType() && genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_318);
    stringBuffer.append(genMemberType.getName());
    stringBuffer.append(TEXT_319);
    stringBuffer.append(genMemberType.getObjectType().getImportedInstanceClassName());
    stringBuffer.append(TEXT_320);
    stringBuffer.append(genMemberType.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_321);
    } else {
    stringBuffer.append(TEXT_322);
    stringBuffer.append(genMemberType.getName());
    stringBuffer.append(TEXT_323);
    stringBuffer.append(genMemberType.getObjectType().getImportedBoundedWildcardInstanceClassName());
    stringBuffer.append(TEXT_324);
    }
    } else {
    stringBuffer.append(TEXT_325);
    stringBuffer.append(genMemberType.getName());
    stringBuffer.append(TEXT_326);
    stringBuffer.append(genMemberType.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_327);
    }
    } else {
    if (genMemberType.getGenPackage().isDataTypeConverters()) { genMemberType = genMemberType.getObjectType();
    stringBuffer.append(TEXT_328);
    stringBuffer.append(genMemberType.getGenPackage().getQualifiedEFactoryInternalInstanceAccessor());
    stringBuffer.append(TEXT_329);
    stringBuffer.append(genMemberType.getName());
    stringBuffer.append(TEXT_330);
    stringBuffer.append(genMemberType.getObjectInstanceClassName());
    stringBuffer.append(TEXT_331);
    } else {
    stringBuffer.append(TEXT_332);
    stringBuffer.append(genMemberType.getGenPackage().getQualifiedEFactoryInternalInstanceAccessor());
    stringBuffer.append(TEXT_333);
    stringBuffer.append(genMemberType.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_334);
    }
    }
    stringBuffer.append(TEXT_335);
    }
    } else {
    for (GenDataType genMemberType : genDataType.getMemberTypes()) {
    stringBuffer.append(TEXT_336);
    if (genMemberType.getGenPackage() == genPackage) {
    if (genPackage.isDataTypeConverters()) {
    stringBuffer.append(TEXT_337);
    stringBuffer.append(genMemberType.getName());
    stringBuffer.append(TEXT_338);
    } else {
    stringBuffer.append(TEXT_339);
    stringBuffer.append(genMemberType.getName());
    stringBuffer.append(TEXT_340);
    stringBuffer.append(genMemberType.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_341);
    if (genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_342);
    stringBuffer.append(genMemberType.getObjectInstanceClassName());
    stringBuffer.append(TEXT_343);
    } else {
    stringBuffer.append(TEXT_344);
    }
    stringBuffer.append(TEXT_345);
    }
    } else {
    if (genMemberType.getGenPackage().isDataTypeConverters()) {
    stringBuffer.append(TEXT_346);
    stringBuffer.append(genMemberType.getGenPackage().getQualifiedEFactoryInternalInstanceAccessor());
    stringBuffer.append(TEXT_347);
    stringBuffer.append(genMemberType.getName());
    stringBuffer.append(TEXT_348);
    } else {
    stringBuffer.append(TEXT_349);
    stringBuffer.append(genMemberType.getGenPackage().getQualifiedEFactoryInternalInstanceAccessor());
    stringBuffer.append(TEXT_350);
    stringBuffer.append(genMemberType.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_351);
    if (genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_352);
    stringBuffer.append(genMemberType.getObjectInstanceClassName());
    stringBuffer.append(TEXT_353);
    } else {
    stringBuffer.append(TEXT_354);
    }
    stringBuffer.append(TEXT_355);
    }
    }
    stringBuffer.append(TEXT_356);
    }
    }
    stringBuffer.append(TEXT_357);
    stringBuffer.append(eDataType);
    stringBuffer.append(TEXT_358);
    } else if (genModel.useGenerics() && (genDataType.isArrayType() || !genDataType.getEcoreDataType().getETypeParameters().isEmpty() || genDataType.getEcoreDataType().getInstanceTypeName().contains("<"))) {
    stringBuffer.append(TEXT_359);
    } else if (genDataType.isArrayType()) {
    stringBuffer.append(TEXT_360);
    stringBuffer.append(genModel.getImportedName("java.lang.UnsupportedOperationException"));
    stringBuffer.append(TEXT_361);
    } else if (genDataType.isPrimitiveType() && genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_362);
    stringBuffer.append(eDataType);
    stringBuffer.append(TEXT_363);
    stringBuffer.append(genDataType.getObjectInstanceClassName());
    stringBuffer.append(TEXT_364);
    } else {
    stringBuffer.append(TEXT_365);
    stringBuffer.append(eDataType);
    stringBuffer.append(TEXT_366);
    }
    stringBuffer.append(TEXT_367);
    }
    stringBuffer.append(TEXT_368);
    if (genModel.useGenerics() && (genDataType.getItemType() != null || genDataType.isUncheckedCast()) && (genPackage.isDataTypeConverters() || genDataType.hasCreatorBody())) {
    stringBuffer.append(TEXT_369);
    }
    stringBuffer.append(TEXT_370);
    stringBuffer.append(genDataType.getName());
    stringBuffer.append(TEXT_371);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EDataType"));
    stringBuffer.append(TEXT_372);
    if (genDataType instanceof GenEnum) {
    if (genPackage.isDataTypeConverters() || genDataType.hasConverterBody()) {
    stringBuffer.append(TEXT_373);
    stringBuffer.append(genDataType.getName());
    stringBuffer.append(TEXT_374);
    stringBuffer.append(genDataType.getImportedInstanceClassName());
    stringBuffer.append(TEXT_375);
    } else {
    stringBuffer.append(TEXT_376);
    }
    } else if (genDataType.getBaseType() != null) { GenDataType genBaseType = genDataType.getBaseType(); 
    if (genBaseType.getGenPackage() == genPackage) {
    stringBuffer.append(TEXT_377);
    stringBuffer.append(genBaseType.getName());
    stringBuffer.append(TEXT_378);
    stringBuffer.append(genBaseType.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_379);
    } else {
    stringBuffer.append(TEXT_380);
    stringBuffer.append(genBaseType.getGenPackage().getQualifiedEFactoryInternalInstanceAccessor());
    stringBuffer.append(TEXT_381);
    stringBuffer.append(genBaseType.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_382);
    }
    } else if (genDataType.getItemType() != null) { GenDataType genItemType = genDataType.getItemType(); 
    if (genPackage.isDataTypeConverters() || genDataType.hasCreatorBody()) {
    stringBuffer.append(TEXT_383);
    stringBuffer.append(genDataType.getName());
    stringBuffer.append(TEXT_384);
    stringBuffer.append(genDataType.getImportedBoundedWildcardInstanceClassName());
    stringBuffer.append(TEXT_385);
    } else { final String singleWildcard = genModel.useGenerics() ? "<?>" : "";
    stringBuffer.append(TEXT_386);
    stringBuffer.append(genModel.getImportedName("java.util.List"));
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_387);
    stringBuffer.append(genModel.getImportedName("java.util.List"));
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_388);
    stringBuffer.append(genModel.getImportedName("java.lang.StringBuffer"));
    stringBuffer.append(TEXT_389);
    stringBuffer.append(genModel.getImportedName("java.lang.StringBuffer"));
    stringBuffer.append(TEXT_390);
    String item; if (!genModel.useGenerics()) { item = "i.next()"; 
    stringBuffer.append(TEXT_391);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    stringBuffer.append(TEXT_392);
    } else { item = "item";
    stringBuffer.append(TEXT_393);
    stringBuffer.append(genModel.getImportedName("java.lang.Object"));
    stringBuffer.append(TEXT_394);
    }
    stringBuffer.append(TEXT_395);
    if (genItemType.getGenPackage() == genPackage) {
    stringBuffer.append(TEXT_396);
    stringBuffer.append(genItemType.getName());
    stringBuffer.append(TEXT_397);
    stringBuffer.append(genItemType.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_398);
    stringBuffer.append(item);
    stringBuffer.append(TEXT_399);
    } else {
    stringBuffer.append(TEXT_400);
    stringBuffer.append(genItemType.getGenPackage().getQualifiedEFactoryInternalInstanceAccessor());
    stringBuffer.append(TEXT_401);
    stringBuffer.append(genItemType.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_402);
    stringBuffer.append(item);
    stringBuffer.append(TEXT_403);
    }
    stringBuffer.append(TEXT_404);
    }
    } else if (!genDataType.getMemberTypes().isEmpty()) {
    if (genPackage.isDataTypeConverters() || genDataType.hasConverterBody()) {
    if (genDataType.isPrimitiveType()) {
    stringBuffer.append(TEXT_405);
    stringBuffer.append(genDataType.getName());
    stringBuffer.append(TEXT_406);
    stringBuffer.append(genDataType.getObjectInstanceClassName());
    stringBuffer.append(TEXT_407);
    if (genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_408);
    stringBuffer.append(genDataType.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_409);
    }
    stringBuffer.append(TEXT_410);
    } else {
    stringBuffer.append(TEXT_411);
    stringBuffer.append(genDataType.getName());
    stringBuffer.append(TEXT_412);
    }
    } else {
    stringBuffer.append(TEXT_413);
    for (GenDataType genMemberType : genDataType.getMemberTypes()) {
    stringBuffer.append(TEXT_414);
    stringBuffer.append(genMemberType.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_415);
    if (genMemberType.getGenPackage() == genPackage) {
    stringBuffer.append(TEXT_416);
    stringBuffer.append(genMemberType.getName());
    stringBuffer.append(TEXT_417);
    stringBuffer.append(genMemberType.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_418);
    } else {
    stringBuffer.append(TEXT_419);
    stringBuffer.append(genMemberType.getGenPackage().getQualifiedEFactoryInternalInstanceAccessor());
    stringBuffer.append(TEXT_420);
    stringBuffer.append(genMemberType.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_421);
    }
    stringBuffer.append(TEXT_422);
    }
    stringBuffer.append(TEXT_423);
    }
    } else if (genPackage.isDataTypeConverters() || genDataType.hasConverterBody()) {
    if (genDataType.isPrimitiveType()) {
    stringBuffer.append(TEXT_424);
    stringBuffer.append(genDataType.getName());
    stringBuffer.append(TEXT_425);
    if (genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_426);
    }
    stringBuffer.append(TEXT_427);
    stringBuffer.append(genDataType.getObjectInstanceClassName());
    stringBuffer.append(TEXT_428);
    if (genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_429);
    stringBuffer.append(genDataType.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_430);
    }
    stringBuffer.append(TEXT_431);
    } else {
    stringBuffer.append(TEXT_432);
    stringBuffer.append(genDataType.getName());
    stringBuffer.append(TEXT_433);
    stringBuffer.append(genDataType.getImportedBoundedWildcardInstanceClassName());
    stringBuffer.append(TEXT_434);
    }
    } else if (genModel.useGenerics() && (genDataType.isArrayType() || !genDataType.getEcoreDataType().getETypeParameters().isEmpty() || genDataType.getEcoreDataType().getInstanceTypeName().contains("<"))) {
    stringBuffer.append(TEXT_435);
    } else if (genDataType.isArrayType()) {
    stringBuffer.append(TEXT_436);
    stringBuffer.append(genModel.getImportedName("java.lang.UnsupportedOperationException"));
    stringBuffer.append(TEXT_437);
    } else {
    stringBuffer.append(TEXT_438);
    }
    stringBuffer.append(TEXT_439);
    }
    }
    } else {
    for (GenClass genClass : genPackage.getGenClasses()) {
    if (genClass.hasFactoryInterfaceCreateMethod()) {
    stringBuffer.append(TEXT_440);
    stringBuffer.append(genClass.getFormattedName());
    stringBuffer.append(TEXT_441);
    stringBuffer.append(genClass.getFormattedName());
    stringBuffer.append(TEXT_442);
    stringBuffer.append(genClass.getTypeParameters());
    stringBuffer.append(genClass.getImportedInterfaceName());
    stringBuffer.append(genClass.getInterfaceTypeArguments());
    stringBuffer.append(TEXT_443);
    stringBuffer.append(genClass.getName());
    stringBuffer.append(TEXT_444);
    }
    }
    if (genPackage.isDataTypeConverters()) {
    for (GenDataType genDataType : genPackage.getAllGenDataTypes()) {
    if (genDataType.isSerializable()) {
    stringBuffer.append(TEXT_445);
    stringBuffer.append(genDataType.getFormattedName());
    stringBuffer.append(TEXT_446);
    stringBuffer.append(genDataType.getImportedParameterizedInstanceClassName());
    stringBuffer.append(TEXT_447);
    stringBuffer.append(genDataType.getName());
    stringBuffer.append(TEXT_448);
    stringBuffer.append(genDataType.getFormattedName());
    stringBuffer.append(TEXT_449);
    stringBuffer.append(genDataType.getName());
    stringBuffer.append(TEXT_450);
    stringBuffer.append(genDataType.getImportedBoundedWildcardInstanceClassName());
    stringBuffer.append(TEXT_451);
    }
    }
    }
    }
    if (!isImplementation && !genModel.isSuppressEMFMetaData()) {
    stringBuffer.append(TEXT_452);
    stringBuffer.append(genPackage.getPackageInterfaceName());
    stringBuffer.append(TEXT_453);
    stringBuffer.append(genPackage.getBasicPackageName());
    stringBuffer.append(TEXT_454);
    } else if (isImplementation) {
    stringBuffer.append(TEXT_455);
    stringBuffer.append(genPackage.getImportedPackageInterfaceName());
    stringBuffer.append(TEXT_456);
    stringBuffer.append(genPackage.getBasicPackageName());
    stringBuffer.append(TEXT_457);
    stringBuffer.append(genPackage.getImportedPackageInterfaceName());
    stringBuffer.append(TEXT_458);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_459);
    }
    stringBuffer.append(TEXT_460);
    stringBuffer.append(genPackage.getImportedPackageInterfaceName());
    stringBuffer.append(TEXT_461);
    stringBuffer.append(genPackage.getImportedPackageInterfaceName());
    stringBuffer.append(TEXT_462);
    }
    stringBuffer.append(TEXT_463);
    stringBuffer.append(isInterface ? genPackage.getFactoryInterfaceName() : genPackage.getFactoryClassName());
    genModel.emitSortedImports();
    stringBuffer.append(TEXT_464);
    return stringBuffer.toString();
  }
}

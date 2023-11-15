package de.atslega.arztpraxis.liste;

public interface ListInterface {

  /* Die Anfrage liefert den Wert true, wenn die Liste keine Objekte
  enth�lt, sonst liefert sie den Wert false. */
  boolean isEmpty();

  
  boolean hasAccess();
  /* Die Anfrage liefert den Wert true, wenn es ein aktuelles Objekt
  gibt, sonst liefert sie den Wert false. */

  void back();

  void next();
  /* Falls die Liste nicht leer ist, es ein aktuelles Objekt gibt und dieses 
  nicht das letzte Objekt der Liste ist, wird das dem aktuellen
  Objekt in der Liste folgende Objekt zum aktuellen Objekt, andernfalls
  gibt es nach Ausf�hrung des Auftrags kein aktuelles
  Objekt, d.h. hasAccess() liefert den Wert false. */
  
  void toFirst();
  /* Falls die Liste nicht leer ist, wird das erste Objekt der Liste aktuelles
  Objekt. Ist die Liste leer, geschieht nichts. */
  
  void toLast();
  /* Falls die Liste nicht leer ist, wird das letzte Objekt der Liste aktuelles
  Objekt. Ist die Liste leer, geschieht nichts. */
  
  Object getObject();
  /* Falls es ein aktuelles Objekt gibt (hasAccess() == true), wird das
  aktuelle Objekt zur�ckgegeben, andernfalls (hasAccess()== false) gibt die 
  Anfrage den Wert null zur�ck. */
  
  void setObject(Object pObject);
  /* Falls es ein aktuelles Objekt gibt (hasAccess() == true) und pObject
  ungleich null ist, wird das aktuelle Objekt durch pObject ersetzt.
  Sonst bleibt die Liste unver�ndert. */
  
  void append(Object pObject);
  /* Ein neues Objekt pObject wird am Ende der Liste eingef�gt. Das
  aktuelle Objekt bleibt unver�ndert. Wenn die Liste leer ist, wird
  das Objekt pObject in die Liste eingef�gt und es gibt weiterhin
  kein aktuelles Objekt (hasAccess() == false).
  Falls pObject gleich null ist, bleibt die Liste unver�ndert. */
  
  void insert(Object pObject);
  /* Falls es ein aktuelles Objekt gibt (hasAccess() == true), wird ein
  neues Objekt vor dem aktuellen Objekt in die Liste eingef�gt.
  Das aktuelle Objekt bleibt unver�ndert. Falls die Liste leer ist
  und es somit kein aktuelles Objekt gibt (hasAccess() == false),
  wird pObject in die Liste eingef�gt und es gibt weiterhin kein aktuelles
  Objekt. Falls es kein aktuelles Objekt gibt (hasAccess() == false) und die Liste
  nicht leer ist oder pObject gleich null ist, bleibt die Liste unver�ndert. */
  
  void concat(List pList);
  /* Die Liste pList wird an die Liste angeh�ngt. Anschlie�end wird
  pList eine leere Liste. Das aktuelle Objekt bleibt unver�ndert.
  Falls pList null oder eine leere Liste ist, bleibt die Liste unver�ndert. */
  
  void remove();
  /* Falls es ein aktuelles Objekt gibt (hasAccess() == true), wird das
  aktuelle Objekt gel�scht und das Objekt hinter dem gel�schten
  Objekt wird zum aktuellen Objekt. Wird das Objekt, das am Ende der Liste steht,
  gel�scht, gibt es kein aktuelles Objekt mehr (hasAccess()== false). Wenn die
  Liste leer ist oder es kein aktuelles Objekt gibt (hasAccess() == false), 
  bleibt die Liste unver�ndert. */

  String display();


}

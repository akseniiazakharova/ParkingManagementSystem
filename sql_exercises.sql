-- SQL ÜBUNGSAUFGABEN (Warenwirtschafts-Datenbank)
-- Diese Abfragen basieren auf dem Standard-Schema für Artikelverwaltung (Northwind-Struktur).

/* Tabellenstruktur (Auszug):
- Kategorien (KategorieNr, Kategoriename)
- Artikel (ArtikelNr, Einzelpreis, Lagerbestand, KategorieNr, LieferantenNr)
- Lieferanten (LieferantenNr, Firma)
*/

-- Aufgabe 1: Durchschnittspreis pro Kategorie
SELECT k.Kategoriename, AVG(a.Einzelpreis) AS Durchschnittspreis
FROM Kategorien k JOIN Artikel a
ON a.KategorieNr = k.KategorieNr
GROUP BY k.Kategoriename;

-- Aufgabe 2: Anzahl der Artikel pro Lieferant (inkl. Lieferanten ohne Artikel)
SELECT l.Firma, COUNT(a.ArtikelNr) AS AnzahlArtikel
FROM Lieferanten l LEFT JOIN Artikel a
ON l.LieferantenNr = a.LieferantenNr
GROUP BY l.Firma;

-- Aufgabe 3: Höchster Preis pro Kategorie, aufsteigend sortiert
SELECT k.Kategoriename, MAX(a.Einzelpreis) AS hoechsterPreis
FROM Kategorien k JOIN Artikel a
ON k.KategorieNr = a.KategorieNr
GROUP BY k.Kategoriename
ORDER BY hoechsterPreis ASC;

-- Aufgabe 4: Lieferanten mit einem durchschnittlichen Lagerbestand über 20
SELECT l.Firma, AVG(a.Lagerbestand) AS DurchschnittsLager
FROM Lieferanten l JOIN Artikel a
ON l.LieferantenNr = a.LieferantenNr
GROUP BY l.Firma
HAVING AVG(a.Lagerbestand) > 20;

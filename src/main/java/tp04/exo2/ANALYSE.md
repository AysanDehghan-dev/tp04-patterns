# Exercice 2 - Question 2 : Réflexion sur les Patterns

## Quels avantages nous apportent les patterns ?

### Le Décorateur (Exercice 1)

Honnêtement, le décorateur c'est vraiment utile. En fait, grâce à lui, j'ai pu faire plein de trucs différents sans créer des millions de classes.

Par exemple, avec UpperCaseDecoratorSequence, j'ai juste transformé le texte en majuscules. Puis après, j'ai ajouté GrepSequence pour filtrer. Et ensuite LineNumberSequence pour numéroter les lignes. Et SliceSequence pour prendre une tranche.

Ce qui est cool, c'est que je peux les combiner comme je veux :
- D'abord majuscules, puis grep
- Ou d'abord grep, puis majuscules
- Ou les trois ensemble
- Ou juste grep + numérotation

Chaque décorateur reste simple, il fait juste une chose. UpperCase fait que les majuscules, point. Il ne doit pas se préoccuper de ce qu'il y a avant ou après.

### Le Composite (Exercice 2)

Avec le Composite, c'est pareil. J'ai TextNode et Element. Et bien, ils font tous les deux toXML() et textContent().

Le truc sympa, c'est que dans Element, quand je fais la boucle sur les enfants, j'appelle child.toXML() sans vérifier si c'est un TextNode ou un Element. Ça marche tout seul, c'est magique !

Si je veux ajouter plus tard un Comment ou un CDATA, je crée juste une nouvelle classe qui étend Node, et c'est bon. Tout le reste fonctionne sans que je change une ligne de code.
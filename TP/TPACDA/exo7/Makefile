Name = Main

JFLAGS = -d build -classpath build -sourcepath "src:tmp"
JC = javac -implicit:none
.SUFFIXES: .java .class


CLASSES = \
        src/fr/iutfbleau/projet/Souris.java \
        src/fr/iutfbleau/projet/Screen.java \
        src/fr/iutfbleau/projet/Main.java

classes: $(CLASSES:.java=.class)

default: classes

run : 
    java -classpath build $(Name)

jar :
    jar cvfe projet.jar fr.iutfbleau.projet.Galerie -C build fr -C res img

runjar :
    java -jar projet.jar

.PHONY : but clean
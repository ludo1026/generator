# encodage de depart
encodeFrom='ISO-8859-1'

# encodage voulu
encodeTo='UTF-8'

# application du script sur les fichiers *.php
for filename in ` find . -type f -name *.$1`

do
	cp $filename $filename.save

	# ecriture du fichier encode
	iconv -f $encodeFrom -t $encodeTo $filename.save -o $filename

        rm $filename.save
done


HOW TO WAIP:
1. Instalujemy SDK Ericssona: https://megawrzuta.pl/download/5ff9d7697af09916e91487ac922fdd03.html
2. Ogarniamy środowisko do Javy : Eclipse/IntelliJ, z konsoli nie damy rady.
3. Reset kompa mile widzany
4. Odpalamy NRG Simulator - najpierw wyskoczy cmd'ek i wam pobuduje jakieś śmieszne rzeczy, potem wystartuje GUI - cierpliwości.


--------------------------- Najpierw sprawdzamy czy działa nam ogólnie symulator i połączenie z telefonami wewnątrz symulatora! ---------------------------
5. Dodajemy telefon : Edit -> Add phone -> dowolny adres, np 10123, model P800 może być - obojętne w sumie.
6. Odpalamy mape : Edit -> Show map - powinno widać dwa telefony na mapie, które można po niej przesuwać - zmieniając ich współrzędne.
7. Odpalamy testową aplikacje: Applications -> Run -> Where Am I -> Run
8. Dostaniemy popup z informacją o aplikacji i okno na logi. Na oknie whereAmI naciskamy start. 
9. Naciskamy na nasz magiczny fajfon, a dokładniej na drugą ikonę, aby wysłać SMS'a. Treść smsa dowolna, byle na numer 6666.
10. Jeżeli wszystko poszło dobrze, to pod kopertą (ostatnia ikona), będzie do odebrania MMS z mapą i naszą aktualną lokalizacją.



--------------------------- Odebranie MMSa z poprawną lokalizacją potwierdza, iż symulator bangla i można przejść do testowania projektu ---------------------------
11. Testowo, można zaciągnąć repo Adriana (jest chyba jeszcze sprawne) i wrzucić projekt do IDE.
12. Wyłączamy whereAmI i zamykamy okno z logami - symulator ma być w stanie "idle".
13. Uruchamiamy projekt waipowy w IDE i paczymy w logi, czy wszystko wstało.
14. Powinno ukazać się podobne okno z informacją o aplikacji, po czym wciśnięcie START nie powinno skutkować wybuchem aplikacji - jeżeli wyskoczy problem uwierzytelniania, witaj w klubie!
15. Jeżeli uruchomiony projekt w IDE śmiga, można normalnie bawić się w symulatorze, z tym, że aplikacja rusza z IDE, a nie prosto z tego śmiesznego Ericsson Network Resource Gateway Simulator.
16. Projekt działa? Zaciągaj nasze repozytorium i kontrybuuj!

Best regards,
PanBulwa


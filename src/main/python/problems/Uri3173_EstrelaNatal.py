from datetime import timedelta
import datetime

revolucoes = int(input())

anosEmJupiter = 11.9 * revolucoes
anosEmSaturno = 29.6 * revolucoes

diasEmJupiter = int(anosEmJupiter * 365 + anosEmJupiter / 4)
diasEmSaturno = int(anosEmSaturno * 365 + anosEmSaturno / 4)

dataEmJupiter = datetime.datetime(2020,12,21) + timedelta(days=diasEmJupiter)
dataEmSaturno = datetime.datetime(2020,12,21) + timedelta(days=diasEmSaturno)

print("Dias terrestres para Jupiter = %.f" % diasEmJupiter)
print("Data terrestre para Jupiter: %s" % dataEmJupiter.date())
print("Dias terrestres para Saturno = %.f" % diasEmSaturno)
print("Data terrestre para Saturno: %s" % dataEmSaturno.date())
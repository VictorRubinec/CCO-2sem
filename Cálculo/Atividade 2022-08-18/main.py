from sqlite3 import Cursor
import psutil
import os
import time

# pegando o sistema operacional
so = os.name

while True:

    if (so == 'nt'):
        os.system('cls')
        print('Sistema operacional: Windows')
    else:
        os.system('clear')
        print('Sistema operacional: Linux')

    print("="*60)

    # pega os dados da cpu
    cpu = psutil.cpu_times(percpu=False)

    # sepera os dados da cpu em variaveis
    cpu_user = round(cpu.user, 2)
    cpu_system = round(cpu.system, 2)
    cpu_idle = round(cpu.idle, 2)
    cpu_interrupt = round(cpu.interrupt, 2)
    cpu_dpc = round(cpu.dpc, 2)

    # Exibe os dados da cpu
    print("Uso da CPU: {}".format(cpu))

    print("-"*60)

    # Exibe os dados da cpu separados por variaveis
    print("Usuario: {}".format(cpu_user))
    print("Sistema: {}".format(cpu_system))
    print("Idle: {}".format(cpu_idle))
    print("Interrupt: {}".format(cpu_interrupt))
    print("DPC: {}".format(cpu_dpc))

    print("="*60)

    # Pega os dados da utilização atual da CPU
    usoCpu = psutil.cpu_percent(interval=1, percpu=False)
    print("Utilização atual da CPU: {}%".format(usoCpu))

    print("="*60)

    # Pega a quantidade de núcleos da CPU físicos
    fisicaCpu = psutil.cpu_count(logical=False)
    print("Núcleos físicos: {}".format(fisicaCpu))

    # Pega a quantidade de núcleos da CPU lógicas
    logicaCpu = psutil.cpu_count(logical=True)
    print("Núcleos lógicos: {}".format(logicaCpu))

    print("="*60)

    # Pega a frequência da CPU
    frequenciaCpu = psutil.cpu_freq()
    print("Frequência da CPU: {}".format(frequenciaCpu))

    print("-"*60)

    # Sepera os dados da frequência da CPU em variaveis
    freCpu_current = round(frequenciaCpu.current, 2)
    freCpu_min = round(frequenciaCpu.min, 2)
    freCpu_max = round(frequenciaCpu.max, 2)

    # Exibe os dados da frequência da CPU
    print("Frequência atual: {} Mhz".format(freCpu_current))
    print("Frequência mínima: {} Mhz".format(freCpu_min))
    print("Frequência máxima: {} Mhz".format(freCpu_max))

    print("="*60)

    # Pega dados da memória RAM
    memoriaRam = psutil.virtual_memory()
    print("Dados da memória RAM: {}".format(memoriaRam))

    print("-"*60)

    # Sepera os dados da memória RAM em variaveis
    memRam_total = round(memoriaRam.total / (1024 ** 3), 2)
    memRam_used = round(memoriaRam.used / (1024 ** 3), 2)
    memRam_free = round(memoriaRam.free / (1024 ** 3), 2)
    memRam_percent = memoriaRam.percent

    # Exibe os dados da memória RAM
    print("Total: {} gb".format(memRam_total))
    print("Usado: {} gb".format(memRam_used))
    print("Livre: {} gb".format(memRam_free))
    print("Percentual de uso: {}%".format(memRam_percent))

    print("="*60)

    # Pega os dados do disco rigido principal
    discoRigido = psutil.disk_usage('C:\\')
    print("Dados do disco rigido principal (C:): {}".format(discoRigido))

    print("-"*60)

    # Sepera os dados do disco rigido em variaveis
    discoRigido_total = round(discoRigido.total / (1024 ** 3), 2)
    discoRigido_used = round(discoRigido.used / (1024 ** 3), 2)
    discoRigido_free = round(discoRigido.free / (1024 ** 3), 2)
    discoRigido_percent = discoRigido.percent

    # Exibe os dados do disco rigido
    print("Total: {} gb".format(discoRigido_total))
    print("Usado: {} gb".format(discoRigido_used))
    print("Livre: {} gb".format(discoRigido_free))
    print("Percentual de uso: {}%".format(discoRigido_percent))

    print("="*60)

    # Pega os dados do disco rigido secundário
    discoRigidoSec = psutil.disk_usage('D:\\')
    print("Dados do disco rigido secundário (D:): {}".format(discoRigidoSec))

    print("-"*60)

    # Sepera os dados do disco rigido secundário em variaveis
    discoRigidoSec_total = round(discoRigidoSec.total / (1024 ** 3), 2)
    discoRigidoSec_used = round(discoRigidoSec.used / (1024 ** 3), 2)
    discoRigidoSec_free = round(discoRigidoSec.free / (1024 ** 3), 2)
    discoRigidoSec_percent = discoRigidoSec.percent

    # Exibe os dados do disco rigido secundário
    print("Total: {} gb".format(discoRigidoSec_total))
    print("Usado: {} gb".format(discoRigidoSec_used))
    print("Livre: {} gb".format(discoRigidoSec_free))
    print("Percentual de uso: {}%".format(discoRigidoSec_percent))

    print("="*60)
   
    time.sleep(5)
%%ANALISIS DE SEÑALES EN DOMINIO DEL TIEMPO Y FRECUENCIA
%Autor: Cuauhtémoc Magaña Hernández
%Se analizan señales básicas y su respectiva Transformada de Fourier

clc; clear; close all;

%% 1. Definición del dominio del tiempo
Fs = 1000;               % Frecuencia de muestreo
T = 1/Fs;                % Periodo de muestreo
t = -1: T :1-T;          % Vector de tiempo

%% 2. Señales en el dominio del tiempo

% Señal senoidal
f = 5;                   % Frecuencia de la señal
senal_seno = sin(2*pi*f*t);

% Pulso rectangular
pulso = rectpuls(t,0.4);

% Función escalón
escalon = double(t >= 0);

%% 3. Gráficas en el dominio del tiempo
figure;
subplot(3,1,1);
plot(t, senal_seno);
title('Señal Senoidal');
xlabel('Tiempo'); ylabel('Amplitud');

subplot(3,1,2);
plot(t, pulso);
title('Pulso Rectangular');
xlabel('Tiempo'); ylabel('Amplitud');

subplot(3,1,3);
plot(t, escalon);
title('Función Escalón');
xlabel('Tiempo'); ylabel('Amplitud');

%% 4. Transformada de Fourier
N = length(t);
frec = (-N/2:N/2-1)*(Fs/N);

S_seno = fftshift(fft(senal_seno));
S_pulso = fftshift(fft(pulso));
S_escalon = fftshift(fft(escalon));

%% 5. Magnitud del espectro
figure;
subplot(3,1,1);
plot(frec, abs(S_seno)/N);
title('Espectro Señal Senoidal');
xlabel('Frecuencia'); ylabel('Magnitud');

subplot(3,1,2);
plot(frec, abs(S_pulso)/N);
title('Espectro Pulso Rectangular');
xlabel('Frecuencia'); ylabel('Magnitud');

subplot(3,1,3);
plot(frec, abs(S_escalon)/N);
title('Espectro Función Escalón');
xlabel('Frecuencia'); ylabel('Magnitud');

%% 6. Propiedad de linealidad
senal_lineal = senal_seno + pulso;
S_lineal = fftshift(fft(senal_lineal));

figure;
plot(frec, abs(S_lineal)/N);
title('Propiedad de Linealidad');
xlabel('Frecuencia'); ylabel('Magnitud');

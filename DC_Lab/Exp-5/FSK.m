%To perform Frequency Shift Keying (FSK)
clc;
clear all;
close all;
FC1 = input('Enter Carrier frequency for 1 : ');
FC2 = input('Enter Carrier frequency for 2 : ');
FP = input('Enter pulse duration : ');
amp = input('Enter amplitude of carrier : ');
amp = amp/2;
T = 0:0.001:1;
C1 = amp * sin(2*pi*FC1*T);
C2 = amp * sin(2*pi*FC2*T);
M = amp * square(2*pi*FP*T)+amp;

for(i=0:1000)
    if(M(i+1) == 0)
        fsk(i+1) = C2(i+1);
    else
        fsk(i+1) = C1(i+1);
    end
end

subplot(4,1,1);
plot(T, C1);
xlabel('Time');
ylabel('Amplitude');
title('Carrier signal for input 1 ');
grid on;
subplot(4,1,2);
plot(T,C2);
xlabel('Time');
ylabel('Amplitude');
title('Carrier signal for input 0');
grid on;
subplot(4, 1, 3);
plot(T,M);
xlabel('Time');
ylabel('Amplitude');
title('Input signal');
axis([0 1 -1 6]);
subplot(4,1,4);
plot(T, fsk);
xlabel('Time');
ylabel('Amplitude');
title('FSK Signal');
grid on;

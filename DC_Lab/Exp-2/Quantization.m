clc;
clear all;
close all;
a = 4;
b = 3;
f = 0.1591;
t = 0:0.02:2*pi;
x = a * sin(2*pi*f*t);
n = length(x);
g_out = zeros(1, n);
del = (2*a)/2^b;
l = -a+del/2;
h = a-del/2;
for i=l:del:h
	for j=1:n
		if(((i-del/2)<x(j)&& x(j)<(i+del/2)))
			g_out(j) = i;
		end
	end
end
stem(t, g_out);
grid on;
hold on;
plot(t, x, 'r');
xlabel('Time');
ylabel('Amplitude');
title('Quantized Signal');